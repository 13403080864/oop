package com.day08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author wq
 * @since 2022-05-30 下午9:46
 *
 *      //序列化：Java对象 --> JSON/YAML/XML
 *     //反序列化：JSON/YAML/XML --> Java对象
 */

public class JsonDemo {
    public static void main(String[] args) throws IOException {

        //map转json
        //mapToJson(); //{"msg":"系统错误","error":1}

        //json转对象
        //JSONToStudent();

        //序列化：Java对象 --> JSON/YAML/XML
        //反序列化：JSON/YAML/XML --> Java对象


        //ObjectMapper是序列化/反序列化操作的核心，Jackson的所有操作都是在ObjectMapper中实现

        //1.序列化：Java对象 --> JSON/YAML/XML
        ObjectMapper mapper = new ObjectMapper();

        Student student = new Student("张三",18);

        String json = mapper.writeValueAsString(student);
        //System.out.println(json);
    }

    public static void mapToJson() throws JsonProcessingException {
        //Map转JSON
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("error", 1);
        map.put("msg", "系统错误");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);

        System.out.println(json);
    }

    public static void JSONToStudent() throws IOException {

        //JSON转对象
        String jsonStr = "{name:\"张三\",age:\"18\"}";

        //JSON字符串转对象
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(jsonStr, Student.class);
        System.out.println(student);

        //还可以支持将JSON文件转对象
        //Student student = mapper.readValue(new File("data.json"), Student.class);
        //System.out.println(student);
    }
}
