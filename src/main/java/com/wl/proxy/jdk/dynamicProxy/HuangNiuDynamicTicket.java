package com.wl.proxy.jdk.dynamicProxy;

import com.wl.proxy.jdk.common.WuleiTicket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HuangNiuDynamicTicket implements InvocationHandler {

    private WuleiTicket wuleiTicket;

    public HuangNiuDynamicTicket() {
    }

    public HuangNiuDynamicTicket(WuleiTicket wuleiTicketRequest) {
        this.wuleiTicket = wuleiTicketRequest;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是黄牛，我可以帮买票");
        //method:public abstract void com.wl.proxy.jdk.common.TicketInterface.findTicket()
        //调用invoke方法会走到被代理对象的方法中
        Object object = method.invoke(wuleiTicket, args);
        System.out.println("我是黄牛，票已到手");
        return object;
    }

    public Object getInstance(WuleiTicket request) {
        this.wuleiTicket = request;
        Class wuleiClazz = wuleiTicket.getClass();
        System.out.println("被代理对象的实例是:" + wuleiClazz);
        //定义谁的什么方法被谁代理，之后返回一个proxy生成的对象
        return Proxy.newProxyInstance(wuleiClazz.getClassLoader(), wuleiClazz.getInterfaces(), this);
    }
}
