package com.wl.prox.jdkproxy.writeProxy;

import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class WlProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(WlClassLoader loader, Class<?>[] interfaces, WlInvocationHandler h) throws Exception {
        //1.生成源代码
        String proxySrc = generateSrc(interfaces[0]);
        //2.保存为java文件
        String filePath = WlProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(proxySrc);
        fw.flush();
        fw.close();
        //3.编译java文件，生成class
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjectsFromFiles(Arrays.asList(f));

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
        CompilationTask task = compiler.getTask(null, manager, diagnostics, null, null, iterable);
        boolean flag = task.call();//通过返回值知道是否编译class成功
        //如果失败，会提示哪里失败了
        //https://docs.oracle.com/javase/7/docs/api/javax/tools/JavaCompiler.html
//        for (Diagnostic diagnostic : diagnostics.getDiagnostics())
//            System.out.format("Error on line %d in %s%n",
//                    diagnostic.getLineNumber(),
//                    diagnostic.getSource().toString());
        manager.close();
        //4.加载到内存（jvm）
        //5.返回被代理后的代理对象
        Class proxyClass = loader.findClass("$Proxy0");
        Constructor constructor = proxyClass.getConstructor(WlInvocationHandler.class);

        return constructor.newInstance(h);
    }

    private static String generateSrc(Class<?> anInterface) {
        StringBuffer src = new StringBuffer();
        src.append("package com.wl.prox.jdkproxy.writeProxy;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + anInterface.getName() + "{" + ln);
        src.append("public WlInvocationHandler h;" + ln);
        src.append("public $Proxy0(WlInvocationHandler h) {" + ln);
        src.append("this.h=h;" + ln);
        src.append("}" + ln);
        for (Method method : anInterface.getMethods()) {
            src.append("public " + method.getReturnType() + " " + method.getName() + "(){" + ln);
            src.append("try{" + ln);
            src.append("Method m= " + anInterface.getName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }
        src.append("}");
        return src.toString();
    }

}
