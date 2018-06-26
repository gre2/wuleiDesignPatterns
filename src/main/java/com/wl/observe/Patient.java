package com.wl.observe;

import com.wl.observe.interf.PatientInterf;

public class Patient implements PatientInterf {

    private Nurse nurse = new Nurse();

    @Override
    public void estBreakFast() {
        System.out.println("病人吃饭了");
        this.nurse.report("护士:病人吃饭了");
    }

    @Override
    public void playBall() {
        System.out.println("病人去打球了");
        this.nurse.report("护士:病人去打球了");
    }


}
