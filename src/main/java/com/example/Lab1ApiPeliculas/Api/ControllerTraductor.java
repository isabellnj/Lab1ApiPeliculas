package com.example.Lab1ApiPeliculas.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTraductor {


    //Ejericicio7-->idioma en html

    @GetMapping("/testhtml")
    public String Test(){
        
        return "test";

    }



    //Ejericicio8
    @GetMapping("/testhtml1")
    public String Test1(){
        
        return "test2";

    }
    
}
