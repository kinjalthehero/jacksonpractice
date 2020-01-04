package com.kinjal.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kinjal.main.Car;
import com.kinjal.util.JsonUtil;

public class Test {

    public static void main(String[] args) throws JsonProcessingException {

        Car car = new Car();
        car.setColor("Red");
        car.setType("Sedan");

        String json = JsonUtil.convertJavatoJson(car);
        System.out.println(json);

        String jsonString = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        ObjectMapper mapper = new ObjectMapper();
        Car newCar =  mapper.readValue(jsonString, Car.class);
        System.out.println(newCar.getColor());
        System.out.println(newCar.getType());
    }
}
