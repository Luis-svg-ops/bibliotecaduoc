package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.bibliotecaduoc.model.Libro;



@Repository

public class LibroRepository {
    
    private List<Libro> listaLibros=new ArrayList<>();

    public List<Libro> obtenerlibros(){
        return listaLibros;
    }

    // metodo que busca el libro por id
    public Libro buscarLibroPorId(int id){
        for(Libro libro:listaLibros){
            if(libro.getId()==id){
                return libro;
            }
        }
        return null;
    }

    //metodo que busca el libro por isbn , retorna un libro
public Libro buscarPorIsbn(String isbn){
        for(Libro libro:listaLibros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }



    //metodo que guarda libros en el arreglo y tetorna libro : guardar
    public Libro guardar(Libro book){
        listaLibros.add(book);
        return book;
    }

    //un metodo que actualiza un libro por id , retorna un libro : actualizar
    //metodo put y pash 
    public Libro actualizar(Libro book){
        Libro libroBuscado=buscarLibroPorId(book.getId());
        if (libroBuscado!=null){
        libroBuscado.setId(book.getId());
        libroBuscado.setIsbn(book.getIsbn());
        libroBuscado.setTitulo(book.getTitulo());
        libroBuscado.setEditorial(book.getEditorial());
        libroBuscado.setFechaPublicacion(book.getFechaPublicacion());
        libroBuscado.setAutor(book.getAutor());
        return libroBuscado;        
    }
        return null;
    } 

    //metodo que elimina un libro por id , retorna un boolean : eliminar
    public void eliminar(int id){
        listaLibros.removeIf(book->book.getId()==id);
    }
 //comentariu para agregarlo ala rama
}
