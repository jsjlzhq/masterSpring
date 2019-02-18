package com.smart.attr;

/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class Car {
    private String brand;
    private String color;
    private double price;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "brand:" + brand + ", color:" + color + ", maxSpeed:" + maxSpeed + ", price:" + price;
    }
}
