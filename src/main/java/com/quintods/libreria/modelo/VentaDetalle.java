package com.quintods.libreria.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class VentaDetalle {

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @DescriptionsList(descriptionProperties="libroTitulo")
    private Libro libro;

    private int ventaDetalleCantidad;

    @Money
    @ReadOnly
    @Depends("libro.libroPrecio, ventaDetalleCantidad")
    public BigDecimal getVentaDetalleTotal() {
        if (libro != null && libro.getLibroPrecio() != null && ventaDetalleCantidad > 0) {
            return libro.getLibroPrecio().multiply(new BigDecimal(ventaDetalleCantidad));
        }
        return BigDecimal.ZERO;
    }
}