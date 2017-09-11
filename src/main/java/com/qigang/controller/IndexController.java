package com.qigang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    @ResponseBody
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","zhangsan");
        mv.addObject("age",30);
        mv.setViewName("index");
        return mv;
    }
}
