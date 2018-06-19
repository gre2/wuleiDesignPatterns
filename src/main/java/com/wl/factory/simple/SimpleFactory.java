package com.wl.factory.simple;

import com.wl.factory.common.Audi;
import com.wl.factory.common.Benz;
import com.wl.factory.common.Bmw;
import com.wl.factory.common.Car;

public class SimpleFactory {

    //spring中的工厂模式
    //bean beanFactory,单例bean，被代理过的bean，原始bean，作用域不同的bean，list类型的bean
    //同一个工厂，难维护
    public Car getCar(String name) {
        if ("Bmw".equalsIgnoreCase(name)) {
            return new Bmw();
        }
        if ("Benz".equalsIgnoreCase(name)) {
            return new Benz();
        }
        if ("Audi".equalsIgnoreCase(name)) {
            return new Audi();
        }

        return null;
    }
}
