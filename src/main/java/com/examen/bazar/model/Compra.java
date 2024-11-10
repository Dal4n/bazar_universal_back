package com.examen.bazar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime feRegistro;

    private String estado;

    private String metodoPago;

    private int cantidadProductos;

    private double total;

    @OneToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;

}
