package com.itboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wh
 * @date 2021年11月12日20:57
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello" )
    public String sayhello(){
        System.out.println("helle springmvcc 你好");
        return "success";
    }
}
