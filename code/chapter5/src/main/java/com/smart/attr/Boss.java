package com.smart.attr;

import java.util.List;
import java.util.Set;

/**
 * Created by zhiqin.li on 2019/1/24.
 */
public class Boss {
    private Car car;
//    private List favorites = new ArrayList();
    private List favorites;
    private int nums[] = new int[]{};

    public Set getNameInfo() {
        return nameInfo;
    }

    public void setNameInfo(Set nameInfo) {
        this.nameInfo = nameInfo;
    }

    private Set nameInfo;

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public List getFavorites() {
        return favorites;
    }

    public void setFavorites(List favorites) {
        this.favorites = favorites;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFavoritesContent() {
        String content ="";
        for(int i=0; i<favorites.size(); i++) {
            content += favorites.get(i).getClass().getName() + " "+ favorites.get(i);

        }
        return content;
    }

    public String getNumsContent() {
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total += nums[i];
        }
        return "" + total;
    }

    public String toString() {
        return "Boss::toString " + car.toString() + "; favorites:" + getFavoritesContent() + "; nums: " + getNumsContent();
    }
}
