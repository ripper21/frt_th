package com.example.frt_th;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaControlador {

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
}
