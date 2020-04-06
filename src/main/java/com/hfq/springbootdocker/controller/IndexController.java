package com.hfq.springbootdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @description: c
 * @author: Mr.He
 * @date: 2020-04-06 13:04
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(ModelMap  model){
        model.addAttribute("userName","何方强");
        return "index";
    }
}
