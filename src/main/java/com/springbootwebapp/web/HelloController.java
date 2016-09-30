package com.springbootwebapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bru9isk on 29/09/16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
