package com.wl.factory.facmethod.transform;

import com.wl.factory.common.Car;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {

    public static List<Class> getAllClassByInterface(Class<Car> carClass) {
        List<Class> returnClassList = new ArrayList<Class>();
        if (carClass.isInterface()) {
            String packName = carClass.getPackage().getName();
            try {
                List<Class> allClass = getClasses(packName);
                for (Class clazz : allClass) {
                    //判断是不是一个接口
                    if (carClass.isAssignableFrom(clazz)) {
                        //本身接口不算
                        if (!clazz.isInterface()) {
                            returnClassList.add(clazz);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }

    //从一个包中查找所有的类，在一个jar包中不能查找
    private static List<Class> getClasses(String packName) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        List<Class> classes = new ArrayList<Class>();
        for (File direc : dirs) {
            classes.addAll(findClass(direc, packName));
        }
        return classes;
    }

    private static List<? extends Class> findClass(File direc, String packName) throws Exception {
        List<Class> classes = new ArrayList<Class>();
        if (!direc.exists()) {
            return classes;
        }
        File[] files = direc.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClass(file, packName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                //去掉.class
                classes.add(Class.forName(packName + "." + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }


}
