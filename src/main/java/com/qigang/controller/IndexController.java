package com.qigang.controller;

import com.qigang.domain.ResponseData;
import com.sun.org.apache.xpath.internal.SourceTree;
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

    @RequestMapping(value="/token")
    @ResponseBody
    public ResponseData token(String code, String token){
        ResponseData data=new ResponseData();
        data.setCode("0");
        data.setMsg("success");
        data.setData("");
        System.out.println("code: "+code);
        System.out.println("token: "+token);
        //如果需要返回restful风格json数据, pom.xml中需要添加jackson的2个包,并且打@ResponseBody
        return data;
    }
}
