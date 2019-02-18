package com.smart.ditype;

/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class CarFactory {
    public static Car createHongQiCar() {
        Car car = new Car();
        car.setBrand("红旗CA72");
        return car;
    }
}
