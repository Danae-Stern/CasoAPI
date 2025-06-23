package com.venta.venta.dto;

import java.time.LocalDate;
import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Venta_dto {
    private Integer id_venta;
    private Integer id_cliente;
    private Integer id_vendedor;
    private LocalDate fecha_venta;

}
