package com.examen.bazar.service;

import com.examen.bazar.model.Compra;
import com.examen.bazar.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;

    public List<Compra> getAll() {
        return compraRepository.findAll();
    }

    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }
}
