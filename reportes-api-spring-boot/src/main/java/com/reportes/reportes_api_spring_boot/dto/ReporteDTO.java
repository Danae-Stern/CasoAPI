package com.reportes.reportes_api_spring_boot.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class ReporteDTO {
    private Integer id;
    private String tipoReporte;
    private Date fechaGeneracion;
    private String descripcion;
    private String jsonDatos;

}
