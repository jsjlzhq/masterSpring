package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by zhiqin.li on 2019/1/16.
 */
public class ReflectTest {

    public static Car initByDefaultConst() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)cons.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "corolla");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "white");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 120);

        return car;
    }

    public static void main(String[] args) throws Throwable{
/*        Car car = initByDefaultConst();
        car.introduce();*/

        /*
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:"+loader);
        System.out.println("parent loader:"+loader.getParent());
        System.out.println("grandparent loader:"+loader.getParent().getParent());*/

        ClassLocationUtils.where(java.net.URL.class);
    }
}
