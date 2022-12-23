package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jason
 * @Date: 2022/12/21 3:48 03 48
 */

@Controller
@RequestMapping("/experience")
public class RequestMappingController {

    @RequestMapping("/academic")
    public String toAcademic() {
        return "academic";
    }


    @RequestMapping("/industry")
    public String toSuccess() {
        return "industry";
    }

}