package com.envios.envios.dto;

import java.time.LocalDate;
import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Envio_dto {
    private Integer id_envio;
    private Integer id_venta;
    private String direccion_envio;
    private String estado_envio;
    private LocalDate fecha_envio;
    private LocalDate fecha_entrega;
}