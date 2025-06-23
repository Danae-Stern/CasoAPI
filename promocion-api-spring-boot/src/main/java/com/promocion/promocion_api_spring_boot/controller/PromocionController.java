package com.promocion.promocion_api_spring_boot.controller;

import com.promocion.promocion_api_spring_boot.dto.PromocionDTO;
import com.promocion.promocion_api_spring_boot.service.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/promocion")
public class PromocionController {

    @Autowired
    private PromocionService service;

    @PostMapping
    public ResponseEntity<PromocionDTO> guardar(@RequestBody PromocionDTO dto) {
        return ResponseEntity.ok(service.guardar(dto));
    }

    @GetMapping
    public ResponseEntity<List<PromocionDTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PromocionDTO> buscar(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PromocionDTO> actualizar(@PathVariable Integer id, @RequestBody PromocionDTO dto) {
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
