package com.xoste.leon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Leon
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> showHello() {
        HashMap<String, Object> map = new HashMap<String, Object>(1);
        map.put("msg", "HelloWorld!");
        return map;
    }
}
