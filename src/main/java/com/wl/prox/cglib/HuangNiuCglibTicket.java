package com.wl.prox.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//CGLib底层采用ASM字节码生成框架
//多态
public class HuangNiuCglibTicket implements MethodInterceptor {


    public Object getInstance(Class clazz) throws Exception {
        //Enhancer类是CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展,Enhancer-增强器
        Enhancer enhancer = new Enhancer();
        //生成的子类，继承哪个父类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //生成源代码，编译class，加载到内存，返回被代理对象的子类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object instance, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //Object为由CGLib动态生成的代理类实例,MethodProxy为生成的代理类对方法的代理引用
        System.out.println("我是cglib黄牛，我可以帮买票");
        methodProxy.invokeSuper(instance, args);
        System.out.println("我是cglib黄牛，票已到手");
        return null;
    }
}
