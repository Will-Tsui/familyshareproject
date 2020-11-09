package com.tsui.ctl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tsui")

public class TestCtl {
    public static void main(String[] args) {
        System.out.println("g");
    }

    @RequestMapping("/good")
    public String test(){
        return "good";
    }
}
