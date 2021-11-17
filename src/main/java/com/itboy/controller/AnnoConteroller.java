package com.itboy.controller;

import com.itboy.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author wh
 * @date 2021年11月13日13:28
 */
@RequestMapping("/anno")
@Controller
@SessionAttributes(value = "mag")
public class AnnoConteroller {
    /**(@RequestParam("jsp前端传的参数")
     * 作用：
      把请求中指定名称的参数给控制器中的形参赋值。
      属性：
      value：请求参数中的名称。
      required：请求参数中是否必须提供此参数。默认值：true。表示必须提供，如果不提供将报错。
     * @param username
     * @return
     */
    @RequestMapping("/requertParams")
    public String requertParams(@RequestParam("name")String username){
        System.out.println(username);
        return "success";
    }

    /**
     * @RequestBody 请求必须是post
     * 作用：
    用于获取请求体内容。直接使用得到是 key=value&key=value...结构的数据。
    get 请求方式不适用。
    属性：
    required：是否必须有请求体。默认值是:true。当取值为 true 时,get 请求方式会报错。如果取值
    为 false，get 请求得到是 null。
     * @param boby
     * @return
     */
    @RequestMapping("/annotest")
    public String annotest(@RequestBody String boby){
        System.out.println(boby);
        return "success";
    }

    /**
     * 作用：
     用于绑定 url 中的占位符。例如：请求 url 中 /delete/{id}，这个{id}就是 url 占位符。
     url 支持占位符是 spring3.0 之后加入的。是 springmvc 支持 rest 风格 URL 的一个重要标志。
     属性：
     value：用于指定 url 中占位符名称。
     required：是否必须提供占位符。
     * @param uid
     * @return
     */
    @RequestMapping("/PathVariable/{id}")
    public String PathVariable(@PathVariable("id") Integer uid){
        System.out.println(uid);
        return "success";
    }

    /**
     * 作用：
     用于获取请求消息头。
     属性：
     value：提供消息头名称
     required：是否必须有此消息头
     注：
     在实际开发中一般不怎么用
     * @param header
     * @return
     */
    @RequestMapping("/requertHeader")
    public String RequestHeader(@RequestHeader(value = "Access") String header){
        System.out.println(header);
        return "success";
    }

    /**
     * 作用：
     用于把指定 cookie 名称的值传入控制器方法参数。
     属性：
     value：指定 cookie 的名称。
     required：是否必须有此 cookie
     * @param cookie
     * @return
     */
    @RequestMapping("/CookieValue")
    public String CookieValue(@CookieValue(value = "JSESSIONID") String cookie){
        System.out.println(cookie);
        return "success";
    }

    @RequestMapping("/ModelAttribute")
    public String ModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("user执行了");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法先执行，当提交的数据和数据库不匹配时，查询数据库数据并提交
     * @param age
     * @return
     */
    @ModelAttribute
    public void showUser(String age, Map<String,User>map){
        User user1=new User();
        user1.setAge(20);
        user1.setSex("男");
        user1.setBirthday(new Date());
        map.put("abc",user1 );
    }
/*    @ModelAttribute
    public User showUser(String age){
        User user1=new User();
        user1.setAge(20);
        user1.setSex("男");
        user1.setBirthday(new Date());
        return  user1;
    }*/


    @RequestMapping("/testPutSession")
    public String testPutSession(Model model){

        model.addAttribute("mag","小明");
        System.out.println("存入session");
        return  "success";
    }
    @RequestMapping("/testGetSession")
    public String testGetSession(ModelMap model){
        Object mag = model.get("mag");
        System.out.println(mag);
        return  "success";
    }
    @RequestMapping("/testCleanSession")
    public String testCleanSession(SessionStatus status){
        status.setComplete();
        System.out.println("清除session");
        return  "success";
    }
}

