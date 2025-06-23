package com.inventario.inventario_api_spring_boot.controller;


import com.inventario.inventario_api_spring_boot.dto.InventarioDTO;
import com.inventario.inventario_api_spring_boot.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService service;

    @PostMapping
    public ResponseEntity<InventarioDTO> guardar(@RequestBody InventarioDTO dto){
        return ResponseEntity.ok(service.guardar(dto));
    }

    @GetMapping
    public ResponseEntity<List<InventarioDTO>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventarioDTO> buscar(@PathVariable Integer id){
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventarioDTO> actualizar(@PathVariable Integer id, @RequestBody InventarioDTO dto){
        return service.actualizar(id, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        return service.eliminar(id)
                ? ResponseEntity.ok().build()
                : ResponseEntity.notFound().build();
    }
}
