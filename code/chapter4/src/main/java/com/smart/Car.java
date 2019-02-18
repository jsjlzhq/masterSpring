package com.smart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by zhiqin.li on 2019/1/17.
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用Car()构造函数。");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性。");
        this.brand = brand;
    }

    public void introduct() {
        System.out.println("brand:"+brand+", color:"+color+", maxSpeed:"+maxSpeed);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory()。");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware.setBeanName()。");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean:destroy()。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()。");
    }

    public void myInit() {
        System.out.println("调用init-method所指定的myInit()，将maxSpeed设置为240。");
        this.maxSpeed = 240;
    }

    public void myDestory() {
        System.out.println("调用destory-method指定的myDestory()。");
    }
}
