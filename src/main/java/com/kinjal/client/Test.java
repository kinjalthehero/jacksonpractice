package com.kinjal.client;

import com.kinjal.main.Car;
import com.kinjal.util.JsonUtil;

public class Test {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("Red");
        car.setType("Sedan");

        System.out.println(JsonUtil.convertJavatoJson(car));
    }
}
