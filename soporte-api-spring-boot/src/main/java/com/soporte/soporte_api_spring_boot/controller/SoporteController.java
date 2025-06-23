package com.soporte.soporte_api_spring_boot.controller;


import com.soporte.soporte_api_spring_boot.dto.SoporteDTO;
import com.soporte.soporte_api_spring_boot.service.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/soporte")
public class SoporteController {

    @Autowired
    private SoporteService service;

    @PostMapping
    public ResponseEntity<SoporteDTO> guardar(@RequestBody SoporteDTO dto) {
        return ResponseEntity.ok(service.guardar(dto));
    }

     @GetMapping
    public ResponseEntity<List<SoporteDTO>> listar() {return  ResponseEntity.ok(service.listar());}

    @GetMapping("/{id}")
    public ResponseEntity<SoporteDTO> buscar(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SoporteDTO> actualizar(@PathVariable Integer id, @RequestBody SoporteDTO dto) {
        return service.actualizar(id, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.ok().build();
    }

}
