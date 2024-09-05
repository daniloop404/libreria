package com.quintods.libreria.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Editorial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    private String nombre;
    
    @Column(length=200)
    private String editorialDireccion;
    
    @Column(length=20)
    private String editorialTelefono;
}