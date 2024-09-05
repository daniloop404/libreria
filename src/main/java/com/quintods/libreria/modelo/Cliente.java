package com.quintods.libreria.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name="Simple", members="id, clienteNombre")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    private String clienteNombre;
    
    @Column(length=20)
    private String clienteTelefono;
    
    @Column(length=100)
    private String clienteEmail;
}