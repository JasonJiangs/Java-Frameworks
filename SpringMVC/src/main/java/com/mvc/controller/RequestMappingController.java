package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


    @RequestMapping(
            value = {"/industry", "/researchIndustry"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String toIndustry() {
        return "industry";
    }

    @GetMapping("/getMapping")
    public String testGetMapping() {
        return "industry";
    }

}