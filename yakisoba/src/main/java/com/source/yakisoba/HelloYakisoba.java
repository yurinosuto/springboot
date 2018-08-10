package com.source.yakisoba;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloYakisoba {
    @GetMapping("/")
    public  String hello(){
        return"helloyakisoba";
    }
}
