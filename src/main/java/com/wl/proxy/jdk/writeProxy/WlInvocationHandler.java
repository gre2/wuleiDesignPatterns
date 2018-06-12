package com.wl.proxy.jdk.writeProxy;

import java.lang.reflect.Method;

public interface WlInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
