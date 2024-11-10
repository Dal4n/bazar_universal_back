package com.examen.bazar.repository;

import com.examen.bazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByTitleIgnoreCaseContainingOrCategoryIgnoreCaseContainingOrBrandIgnoreCaseContaining(
            String title, String category, String brand
    );
}
