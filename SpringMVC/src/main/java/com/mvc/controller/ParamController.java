package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author: Jason
 * @Date: 2023/1/10 14:26 14 26
 */

@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testParam(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "industry";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false, defaultValue = "default_username") String username,
            String password, String[] hobby,
            @RequestHeader(value = "Host", required = true, defaultValue = "") String host
            ){
        System.out.println("username:"+username+",password:"+password+",hobby:"+ Arrays.toString(hobby));
        System.out.println("Host: " + host);
        return "industry";
    }

}