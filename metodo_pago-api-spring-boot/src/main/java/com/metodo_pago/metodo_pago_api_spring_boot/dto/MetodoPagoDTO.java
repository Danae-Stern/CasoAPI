package com.metodo_pago.metodo_pago_api_spring_boot.dto;

import lombok.Data;

@Data
public class MetodoPagoDTO {
    private Integer id;
    private String nomMetodo;
    private String descripcionMetodo;
    private String estadoMetodo;
}
