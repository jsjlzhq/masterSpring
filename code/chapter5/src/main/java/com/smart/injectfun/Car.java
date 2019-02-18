package com.smart.injectfun;

/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class Car {
    private String brand;
    private int maxSpeed;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return brand + " " + maxSpeed + " " + price;
    }
}
