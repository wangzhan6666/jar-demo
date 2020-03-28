package com.wangzhan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JarController {

    @RequestMapping("/boot/json")
    public @ResponseBody
    Object json(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","炸炸编辑的wow!!");
        map.put("address","天空中最亮的那颗星星！！！");

        return map;
    }

    @RequestMapping("/boot/jsp")
    public String jsp(Model model){
        model.addAttribute("name","炸炸编辑的wow!!");

        return "index";
    }



}
