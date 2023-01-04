package com.xxj.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/29 6:08 PM
 */

public class TestSaasSchoolDTO {
    private static ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)  //类级别的设置，JsonInclude.Include.NON_EMPTY标识只有非NULL的值才会被纳入json string之中，其余的都将被忽略
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES) //禁止使用出现未知属性之时，抛出异常

            .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
            .setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);//转化后的json的key命名格式


    public static void main(String[] args) throws IOException {

        SaasSchoolDTO saasSchoolDTO = new SaasSchoolDTO();

        saasSchoolDTO.setEBxlx("qwe");
        String jsonStr = OBJECT_MAPPER.writeValueAsString(saasSchoolDTO);


        SaasSchoolDTO saasSchoolDTO1 = OBJECT_MAPPER.readValue(jsonStr, SaasSchoolDTO.class);
        System.out.println(saasSchoolDTO1);



    }
}
