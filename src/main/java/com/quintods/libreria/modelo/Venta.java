package com.quintods.libreria.modelo;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members="ventaFecha; cliente; detalles; ventaTotales")
public class Venta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate ventaFecha;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @ReferenceView("Simple")
    @DescriptionsList(descriptionProperties="clienteNombre")
    private Cliente cliente;

    @ElementCollection
    @ListProperties("libro.libroTitulo, ventaDetalleCantidad, ventaDetalleTotal")
    private Collection<VentaDetalle> detalles;

    @Money
    @ReadOnly
    @Depends("detalles.ventaDetalleTotal")
    public BigDecimal getVentaTotales() {
        BigDecimal total = BigDecimal.ZERO;
        if (detalles != null) {
            for (VentaDetalle detalle : detalles) {
                total = total.add(detalle.getVentaDetalleTotal());
            }
        }
        return total.multiply(new BigDecimal("1.15"));
    }
}