package com.shop.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/")
    public String home(){
        return "index.html"; //создать "/WEB-INF/views/" в webapp
    }
}
