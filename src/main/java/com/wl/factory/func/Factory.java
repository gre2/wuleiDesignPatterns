package com.wl.factory.func;

import com.wl.factory.common.Car;

public interface Factory {

    //符合汽车上路标准
    //尾气排放标准
    //电子设备安全系数
    //必须配备安全带、安全气囊
    //轮胎的耐磨程度
    //可以在每个类里面分别实现
    Car getCar();
}
