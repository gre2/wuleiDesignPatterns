package com.wl.builder;

//建造者模式是基本方法的调用顺序安排，这些基本方法都实现了
//工厂的重点是创造，你要什么对象我创造一个什么对象给你，不关系组装顺序
public class TransformMainTest {
    public static void main(String[] args) {

        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
    }
}
