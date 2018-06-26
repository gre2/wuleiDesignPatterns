package com.wl.observe;

import com.wl.observe.interf.NurseInterf;

public class Nurse implements NurseInterf {

    @Override
    public void report(String context) {
        System.out.println("护士:病人有活动开始汇报");
        System.out.println("护士:病人结束活动");
    }


}
