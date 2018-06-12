package com.wl.proxy.jdk.writeProxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
        Iterable iterable = manager.getJavaFileObjects(f);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        manager.close();
        //4.加载到内存（jvm）
        //5.返回被代理后的代理对象
        Class proxyClass = loader.findClass("$Proxy0");
        Constructor constructor = proxyClass.getConstructor(WlInvocationHandler.class);

        return constructor.newInstance(h);
    }

    private static String generateSrc(Class<?> anInterface) {
        StringBuffer src = new StringBuffer();
        src.append("package com.wl.proxy.jdk.writeProxy;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements" + anInterface.getName() + "{" + ln);
        src.append("public WlInvocationHandler h;" + ln);
        src.append("public $Proxy0(WlInvocationHandler h) {" + ln);
        src.append("this.h=h;" + ln);
        src.append("}" + ln);
        for (Method method : anInterface.getMethods()) {
            src.append("public " + method.getReturnType() + " " + method.getName() + "(){" + ln);
            src.append("try{" + ln);
            src.append("Method m=" + anInterface.getName() + ".class.getMethod(\"" + method.getName() + "\"),new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }
        src.append("}");
        return src.toString();
    }

}
