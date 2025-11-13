package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

