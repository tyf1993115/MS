package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model) throws Exception{
        User user1 = userService.getUser(user);
        System.out.println(user);
        System.out.println(user1);
        if (null!=user1){
            model.addAttribute("user",user1);
            return "success";
        }
        return "../../index";
    }
    @RequestMapping("/regis")
    public String regis(Model model)throws Exception{
        return "regis";
    }
    @RequestMapping("/regis1")
    public String regis1(User user,Model model)throws Exception{
//        UserService.savaRegisUser(user);
        return "success";

    }
}
