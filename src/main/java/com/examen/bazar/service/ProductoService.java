package com.examen.bazar.service;

import com.examen.bazar.model.Producto;
import com.examen.bazar.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repository;

    public List<Producto> search(String search) {
        return repository.findByTitleIgnoreCaseContainingOrCategoryIgnoreCaseContainingOrBrandIgnoreCaseContaining(
                search, search, search).stream().toList();
    }

    public Producto getById(Long id) {
        return repository.findById(id).get();
    }

}
