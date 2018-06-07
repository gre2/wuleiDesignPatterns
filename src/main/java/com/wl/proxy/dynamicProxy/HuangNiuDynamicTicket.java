package com.wl.proxy.dynamicProxy;

import com.wl.proxy.common.WuleiTicket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HuangNiuDynamicTicket implements InvocationHandler {

    private WuleiTicket wuleiTicket;

    public HuangNiuDynamicTicket(WuleiTicket wuleiTicketRequest) {
        this.wuleiTicket = wuleiTicketRequest;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是黄牛，我可以帮买票");
        Object object = method.invoke(wuleiTicket, args);
        System.out.println("我是黄牛，票已到手");
        return object;
    }
}
