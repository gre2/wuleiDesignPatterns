package com.wl.template;

public class Coffee extends Drink {

    @Override
    protected void addCoundiments() {
        System.out.println("添加牛奶和糖");
    }

    @Override
    protected void pourInCup() {
        System.out.println("将咖啡倒入杯中");
    }
}
