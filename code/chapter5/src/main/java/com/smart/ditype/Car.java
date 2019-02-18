package com.smart.ditype;

/**
 * Created by zhiqin.li on 2019/1/23.
 */
public class Car {

    private String brand;
    private int maxSpeed;
    private double price;
    private String color;

//    public Car(String brand, String color) {
//        this.brand = brand;
//        this.color = color;
//        this.maxSpeed = 120;
//        this.price = 20;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


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
        return "brand: "+brand+", maxSpeed: "+maxSpeed+", price: "+price+", color: "+color;
    }
}
