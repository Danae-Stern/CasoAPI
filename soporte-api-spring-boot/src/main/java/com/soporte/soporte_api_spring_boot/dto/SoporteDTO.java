package com.soporte.soporte_api_spring_boot.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class SoporteDTO {
    private Integer id;
    private Integer idUsuario;
    private String tipoTicket;
    private String descripcion;
    private String estado;
    private Date fechaCreacion;
    private Date fechaResolucion;
}
