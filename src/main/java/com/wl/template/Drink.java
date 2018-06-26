package com.wl.template;

//修改子类，影响父类
public abstract class Drink {

    //子类不会修改creteDrink  final修饰
    public final void creteDrink() {
        //烧水
        boilWater();
        //杯子准备好,放原料
        pourInCup();
        //用水泡
        brew();
        //todo 此处添加一个钩子,可以在子类重写，进行覆盖
        if (!isAddCoudiments()) {
            return;
        }
        //添加辅料
        addCoundiments();
    }

    protected boolean isAddCoudiments() {
        return true;
    }

    //没有必要把别的方法暴露出去 protected 修饰
    protected abstract void addCoundiments();

    private void brew() {
        System.out.println("将开水放入杯中进行冲泡");
    }

    protected abstract void pourInCup();

    private void boilWater() {
        System.out.println("烧开水，烧到100度可以起锅了");
    }
}