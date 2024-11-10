package com.examen.bazar.controller;

import com.examen.bazar.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examen.bazar.service.ProductoService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos/{search}")
    public ResponseEntity<?> searchItems(@PathVariable String search) {
        return ResponseEntity.ok(productoService.search(search));
    }

    @GetMapping("/producto/{id}")
    public ResponseEntity<?> getItem(@PathVariable Long id) {

        Producto p = productoService.getById(id);

        if (p == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(p);
    }

}

