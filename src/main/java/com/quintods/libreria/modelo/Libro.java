package com.quintods.libreria.modelo;
import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Libro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    private String libroTitulo;
    
    @Column(length=20)
    private String libroISBN;
    
    @Money
    private BigDecimal libroPrecio;
    
    private int libroStock;
    
    @Column(length=50)
    private String libroGenero;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    private Editorial editorial;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="autorNombre")
    private Autor autor;
    
    @File
    private String libroImagen;
}