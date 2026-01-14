package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Producto;
import com.example.demo.respository.ProductoRepository;

@Service
public class ServiceStock {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    public void agregar(Producto producto) {
        productoRepository.save(producto);
    }

    public void actualizar(Producto productoActualizado) {
        productoRepository.save(productoActualizado);
    }

    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}