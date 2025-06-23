package com.reportes.reportes_api_spring_boot.controller;

import com.reportes.reportes_api_spring_boot.dto.ReporteDTO;
import com.reportes.reportes_api_spring_boot.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reporte")
public class ReporteController {

    @Autowired
    private ReporteService service;

    @PostMapping
    public ResponseEntity<ReporteDTO> guardar(@RequestBody ReporteDTO dto) {
        return ResponseEntity.ok(service.guardar(dto));
    }

    @GetMapping
    public ResponseEntity<List<ReporteDTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReporteDTO> buscar(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReporteDTO> actualizar(@PathVariable Integer id, @RequestBody ReporteDTO dto) {
        return service.actualizar(id, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ReporteDTO> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.ok().build();
    }


}
