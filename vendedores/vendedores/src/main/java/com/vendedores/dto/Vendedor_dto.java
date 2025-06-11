package com.vendedores.dto;

import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Vendedor_dto {
    private Integer id_vendedor;
    private Integer id_usuario;
    private String nombre_completo;
    private String rut;
    private String areas_ventas;

}
