package com.kinjal.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kinjal.main.Car;

import java.io.File;
import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavatoJson(Object obj) {

        String jsonValue = "";

        try {
            mapper.writeValue(new File("target/carjson.json"), obj);
            jsonValue = mapper.writeValueAsString(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonValue;
    }

}