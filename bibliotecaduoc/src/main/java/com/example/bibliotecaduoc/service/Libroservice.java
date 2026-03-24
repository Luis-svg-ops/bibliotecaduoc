package com.example.bibliotecaduoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaduoc.repository.LibroRepository;
import com.example.bibliotecaduoc.model.Libro;

@Service

public class LibroService {
    @Autowired
    //el autowired conecta las 2 conecciones entre el servicio y el repositorio
    private LibroRepository libroRepository;

    public Libro guardar(Libro book){
        return libroRepository.guardar(book);
    }

    public List<Libro> readAll(){
        return libroRepository.obtenerlibros();
    }

    public Libro save(Libro book){
        return libroRepository.guardar(book);
    }

    public Libro update(Libro book){
        return libroRepository.actualizar(book);
    }

    public void delete(int id){
        libroRepository.eliminar(id);
    }

    public Libro readById(int id){
        return libroRepository.buscarLibroPorId(id);
    }

    public Libro readByIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }

}
