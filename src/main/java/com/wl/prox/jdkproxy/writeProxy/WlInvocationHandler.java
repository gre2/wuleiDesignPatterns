package com.wl.prox.jdkproxy.writeProxy;

import java.lang.reflect.Method;

public interface WlInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
