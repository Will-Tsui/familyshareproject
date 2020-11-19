package com.tsui.ctl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tsui")

public class TestCtl {

    @RequestMapping("/good")
    public String test(){

        System.out.println("god");
        return "good";
    }
}
