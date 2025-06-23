package com.detalleventa.detalleventa.controllers;

import com.detalleventa.detalleventa.dto.DetalleV_dto;
import com.detalleventa.detalleventa.services.DetalleV_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalleventa")
public class DetalleV_controllers {

    @Autowired
    private DetalleV_services service;

    @PostMapping
    public ResponseEntity<DetalleV_dto> crear(@RequestBody DetalleV_dto dto) {
        return ResponseEntity.ok(service.crear(dto));
    }

    @GetMapping
    public ResponseEntity<List<DetalleV_dto>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleV_dto> obtener(@PathVariable Integer id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleV_dto> actualizar(@PathVariable Integer id, @RequestBody DetalleV_dto dto) {
        return ResponseEntity.ok(service.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
