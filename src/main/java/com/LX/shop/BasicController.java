package com.LX.shop;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }

    @GetMapping("/shop")
    @ResponseBody
    String shop(){
        return "shop 페이지입니다.";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "mypage 페이지입니다.";
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        return LocalDateTime.now().toString();
    }

}
