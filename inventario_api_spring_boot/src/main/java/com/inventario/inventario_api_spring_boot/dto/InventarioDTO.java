package com.inventario.inventario_api_spring_boot.dto;

import lombok.Data;

@Data
public class InventarioDTO {
    private Integer id;
    private Integer idProducto;
    private Integer stockDisponible;
    private String ubicacionBodega;

}
