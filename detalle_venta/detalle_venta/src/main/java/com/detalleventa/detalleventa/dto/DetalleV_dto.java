package com.detalleventa.detalleventa.dto;

import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class DetalleV_dto {
    private Integer id_detalle;
    private Integer id_venta;
    private Integer id_producto;
    private Integer cantidad;
    private Double precio_unitario;

}
