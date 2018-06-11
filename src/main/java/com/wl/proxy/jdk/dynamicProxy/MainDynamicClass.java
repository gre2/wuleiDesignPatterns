package com.wl.proxy.jdk.dynamicProxy;

import com.wl.proxy.jdk.common.TicketInterface;
import com.wl.proxy.jdk.common.WuleiTicket;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class MainDynamicClass {

    //1.拿到被代理对象的引用,获取它的接口
    //2.jdk代理会重新生成一个类，同时实现代理对象所实现的接口
    //3.把被代理对象的引用也获取到
    //4.重新动态生成一个class字节码，然后编译
    public static void main(String[] args) throws Exception {

        TicketInterface ticketInterfaceA = (TicketInterface) Proxy.newProxyInstance(WuleiTicket.class.getClassLoader(), WuleiTicket.class.getInterfaces(), new HuangNiuDynamicTicket(new WuleiTicket()));
        System.out.println("代理对象的class是:" + ticketInterfaceA.getClass());
        ticketInterfaceA.findTicket();


        //获取字节码内容
        byte[] data1 = ProxyGenerator.generateProxyClass("$Proxy1", new Class[]{TicketInterface.class});
        FileOutputStream os = new FileOutputStream("$Proxy1.class");
        os.write(data1);
        os.close();
    }
}
