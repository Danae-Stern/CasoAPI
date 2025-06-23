package com.promocion.promocion_api_spring_boot.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class PromocionDTO {
    private Integer id;
    private String nomPromocion;
    private String descripcion;
    private Float descuentoPromocion;
    private Date fechaInicioPromocion;
    private Date fechaFinPromocion;
    private String activaPromocion;
    private String tipoAplicacion;
    private Integer idVendedor;
}
