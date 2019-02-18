package com.smart.attr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class AttrTest {
    public ApplicationContext factory = null;
    public ApplicationContext childFactory = null;

    private static String[] CONFIG_FILES = {"com/smart/attr/beans1.xml"};
    private static String[] CONFIG_FILES2 = {"com/smart/attr/beans2.xml"};

    @BeforeClass
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
        childFactory = new ClassPathXmlApplicationContext(CONFIG_FILES2, factory);
    }

//    @Test
//    public void Test1() {
//        Boss boss = (Boss)factory.getBean("boss");
//        assertNotNull(boss);
//        assertNotNull(boss.getCar());
//        System.out.println(boss);
//    }

    @Test
    public void Test2() {
        Boss boss = (Boss)childFactory.getBean("boss");
        assertNotNull(boss);
        assertNotNull(boss.getCar());
        System.out.println(boss);
    }
}
