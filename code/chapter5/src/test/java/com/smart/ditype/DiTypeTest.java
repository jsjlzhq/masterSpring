package com.smart.ditype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * Created by zhiqin.li on 2019/1/23.
 */
public class DiTypeTest {

    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = {"com/smart/ditype/beans.xml"};

    @BeforeClass
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

//    @Test
//    public void testCar() {
//        Car car = (Car)factory.getBean("car");
//        assertNotNull(car);
//        System.out.println(car);
//    }

//    @Test
//    public void testCar1() {
//        Car car = (Car)factory.getBean("car1");
//        assertNotNull(car);
//        System.out.println(car);
//        System.out.println();
//    }

//    @Test
//    public void testCar5() {
//        Car car = (Car)factory.getBean("car5");
//        assertNotNull(car);
//        System.out.println(car);
//        System.out.flush();
//    }

//    @Test
//    public void testCar6() {
//        Car car = (Car)factory.getBean("car6");
//        assertNotNull(car);
//        System.out.println(car);
//        System.out.flush();
//    }

    @Test
    public void testCar7() {
        Car car = (Car)factory.getBean("car7");
        assertNotNull(car);
        System.out.println(car);
    }
}
