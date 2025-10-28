package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.model.Producto;

@Service
public class ServiceStock {

    private static List<Producto> productos = new ArrayList<>();
    private static long ID = 43386442;

    public List<Producto> listar() {
        return productos;
    }

    public void agregar(Producto producto) {
        producto.setId(ID++);
        productos.add(producto);
    }

    public void actualizar(Producto productoActualizado) {

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.getId().equals(productoActualizado.getId())) {
                productos.set(i, productoActualizado); // reemplaza el producto
                return;
            }
        }
    }

    public Producto buscarPorId(Long id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminar(Long id) {
        productos.removeIf(p -> p.getId().equals(id));// por cada producto p en la lista elimina los q tengan el mismo id
    }

}
