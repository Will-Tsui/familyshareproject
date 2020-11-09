package com.tsui.fsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.tsui")
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
