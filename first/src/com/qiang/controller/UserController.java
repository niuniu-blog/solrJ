package com.qiang.controller;

import com.qiang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "receiveInt", method = RequestMethod.POST)
    public String receiveInt(Integer id) {
        System.out.println(id);
        return "receiveInt";
    }

    @RequestMapping("receiveStr")
    public String receiveStr(String name) {
        System.out.println(name);
        return "receiveStr";
    }

    @RequestMapping("receiveUser")
    public String receiveUser(User user) {
        System.out.println(user);
        return "receiveStr";
    }

}
