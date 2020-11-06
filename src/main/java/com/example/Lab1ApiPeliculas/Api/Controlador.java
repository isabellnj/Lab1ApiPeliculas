package com.example.Lab1ApiPeliculas.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Lab1ApiPeliculas.Model.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
   
    private static List<Movie>arraylist = new ArrayList(Arrays.asList(
        new Movie(1,"Pulp Fiction", 1994, "url"),
        new Movie(2,"ea vida es bella", 1997, "url"),
        new Movie(3,"El club de la lucha (1999)", 1999, "url"),
        new Movie(4,"la lista de Schindler (1993)", 1993, "url"),
        new Movie(5,"la naranja mecánica (1971)", 1971, "url")


    ));


    @GetMapping("/movies")
    public List<Movie> getall(){

    return arraylist;
}
}
