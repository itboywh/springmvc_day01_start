package com.itboy.controller;

import com.itboy.domin.Account;
import com.itboy.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wh
 * @date 2021年11月13日9:18
 */
@Controller
@RequestMapping("/param")


public class paramController {
    @RequestMapping("/paramtest")
    public String paramtest(String username ,String password){
        System.out.println("参数请求执行了");
        System.out.println("用户名"+username);
        System.out.println("密码"+password);
        return  "success";
    }
    @RequestMapping(value = "/formtest")
    public String formtest(Account account){
        System.out.println(account);
        return  "success";
    }
    @RequestMapping("/todate")
    public String todate(User user){
        System.out.println("参数请求执行了");
        System.out.println(user);
        return  "success";
    }


}
