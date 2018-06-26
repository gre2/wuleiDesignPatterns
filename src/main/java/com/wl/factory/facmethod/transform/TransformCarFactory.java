package com.wl.factory.facmethod.transform;

import com.wl.factory.common.Car;

import java.util.List;
import java.util.Random;

//不想手动输入car的种类，随便制造即可
public class TransformCarFactory {

    public static Car getCar(Class clazz) throws Exception {
        return (Car) Class.forName(clazz.getName()).newInstance();
    }

    public static Car getCar() throws Exception {
        Car car = null;
        //todo  看看
        List<Class> carList = ClassUtils.getAllClassByInterface(Car.class);
        Random random = new Random();
        int rand = random.nextInt(carList.size());
        car = getCar(carList.get(rand));
        return car;
    }
}
