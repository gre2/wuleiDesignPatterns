package com.wl.prox.jdkproxy.writeProxy;

import com.wl.prox.jdkproxy.common.WuleiTicket;

import java.lang.reflect.Method;

//custom  自定义
public class HuangNiuCustomTicket implements WlInvocationHandler {

    private WuleiTicket wuleiTicket;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是黄牛，我可以帮买票");
        method.invoke(wuleiTicket, args);
        System.out.println("我是黄牛，票已到手");
        return null;
    }

    public Object getInstance(WuleiTicket wuleiTicket) throws Exception {
        this.wuleiTicket = wuleiTicket;
        Class clazz = wuleiTicket.getClass();
        return WlProxy.newProxyInstance(new WlClassLoader(), clazz.getInterfaces(), this);
    }
}
