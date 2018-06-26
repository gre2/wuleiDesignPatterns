package com.wl.template;

public class Tea extends Drink {


    @Override
    protected void addCoundiments() {
        System.out.println("添加蜂蜜");
    }

    @Override
    protected void pourInCup() {
        System.out.println("将茶叶放入杯中");
    }

    //重写父类的钩子方法，进行覆盖
    @Override
    protected boolean isAddCoudiments() {
        return false;
    }
}
