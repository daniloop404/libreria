package com.quintods.libreria.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Autor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    private String autorNombre;
    
    @File
    private String autorImagen;
}