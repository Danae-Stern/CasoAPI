package com.metodo_pago.metodo_pago_api_spring_boot.controller;

import com.metodo_pago.metodo_pago_api_spring_boot.dto.MetodoPagoDTO;
import com.metodo_pago.metodo_pago_api_spring_boot.model.MetodoPago;
import com.metodo_pago.metodo_pago_api_spring_boot.repository.MetodoPagoRepository;
import com.metodo_pago.metodo_pago_api_spring_boot.service.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metodo_pago")
public class MetodoPagoController {

    @Autowired
    private MetodoPagoService service;

    @PostMapping
    public ResponseEntity<MetodoPagoDTO> guardar(@RequestBody MetodoPagoDTO dto) {
        return ResponseEntity.ok(service.guardar(dto));
    }

    @GetMapping
    public ResponseEntity<List<MetodoPagoDTO>> listar() {return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetodoPagoDTO> buscar(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MetodoPagoDTO> actualizar(@PathVariable Integer id, @RequestBody MetodoPagoDTO dto) {
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
