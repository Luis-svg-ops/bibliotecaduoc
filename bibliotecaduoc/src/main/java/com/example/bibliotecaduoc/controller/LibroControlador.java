package com.example.bibliotecaduoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.Libroservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@RestController


public class LibroControlador {
    @Autowired 
    private LibroService LibroService;


    @GetMapping
    public List<Libro> listaLibros() {
        return LibroService.readAll();
    }
    
    
}
