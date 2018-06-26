package com.wl.factory.abstr;

import com.wl.factory.abstr.common.Car;

public interface CarFactory {

    public Car getBmwModel();

    public Car getAudiModel();

    public Car getBenzModel();
}
