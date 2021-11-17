package com.itboy.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wh
 * @date 2021年11月13日10:47
 */
public class StringtoConverter implements Converter<String ,Date> {



    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("请输入数据");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            //字符串转换data
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("请输入数据");
        }

    }

}
