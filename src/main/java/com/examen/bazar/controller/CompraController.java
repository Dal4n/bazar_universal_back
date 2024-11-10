package com.examen.bazar.controller;

import com.examen.bazar.model.Compra;
import com.examen.bazar.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CompraController {

    @Autowired
    private CompraService service;

    @GetMapping("/purchases")
    public ResponseEntity<?> getSales() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/purchases")
    public ResponseEntity<?> getSales(@RequestBody Compra compra) {
        return ResponseEntity.ok(service.save(compra));
    }
}

