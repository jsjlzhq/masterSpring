package com.smart.injectfun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class InjectFunTest {
    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = {"com/smart/injectfun/beans.xml"};

    @BeforeClass
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void Test1() {
        MagicBoss magicBoss = (MagicBoss)factory.getBean("magicBoss");
        assertNotSame(magicBoss.getCar(), magicBoss.getCar());
    }
}
