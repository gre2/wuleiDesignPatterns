package com.wl.observe.transform;

public class WuleiWatch implements WatchPeople {

    @Override
    public void update(String content) {
        System.out.println("吴磊:王敏开始活动");
        System.out.println("吴磊:王敏结束活动");
    }
}
