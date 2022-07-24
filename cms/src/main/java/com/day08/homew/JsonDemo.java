package com.day08.homew;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wq
 * @since 2022-05-31 12:46
 * json字符串解析成Java对象
 */

public class JsonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        //json字符串解析成Java对象
        JSONToObject(); //ProvinceDemo{province='黑龙江', city='哈尔滨'}
        JSONToObject1();
    }

    public static  void JSONToObject() throws JsonProcessingException {
        String JsonStr = "{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" } ";
        ObjectMapper mapper = new ObjectMapper();
        Province readValue = mapper.readValue(JsonStr, Province.class);
        System.out.println(readValue);
    }


    public static void JSONToObject1() throws JsonProcessingException {

        String JsonStr = "{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }," +
                " { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";

        ObjectMapper mapper = new ObjectMapper();
        ProvinceDemo provinceDemo = mapper.readValue(JsonStr, ProvinceDemo.class);

        for (Province province :provinceDemo.getProvinces()) {

            System.out.println(province);
        }
    }
}
