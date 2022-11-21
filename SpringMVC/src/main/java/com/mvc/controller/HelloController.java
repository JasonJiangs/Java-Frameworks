package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jason
 * @Date: 2022/11/19 15:39 15 39
 */

@Controller
public class HelloController {

    // "/" --> /WEB-INF/template/index.html
    // localhost:8080/springMVC/  : http://localhost:8080/SpringMVC/ through Tomcat --> Add Configuration --> Tomcat Local
    @RequestMapping(value = "/")
    public String index() {
        // set view name
        return "index";
    }

}