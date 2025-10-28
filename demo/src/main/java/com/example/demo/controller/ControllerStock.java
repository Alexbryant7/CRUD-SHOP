package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.Producto;
import com.example.demo.service.ServiceStock;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerStock {

    @Autowired
    private ServiceStock service;

    @GetMapping("/")
    public String ListarProductos(Model model) {
        model.addAttribute("productos", service.listar());
        return "index";
    }

    @GetMapping("/create") // mostrar el formulario
    public String productForm(Model model) {
        model.addAttribute("producto", new Producto());
        return "productForm";
    }

    @PostMapping("/guardar") // agregar
    public String guardarProducto(@ModelAttribute Producto producto) {
        if (producto.getId() != null) {
            service.actualizar(producto);
        } else {
            service.agregar(producto);
        }
        return "redirect:/";
    }

    @GetMapping("/editar/{id}") // mostrar el formulario con datos
    public String editarProducto(@PathVariable Long id, Model model) {
        Producto producto = service.buscarPorId(id);
        model.addAttribute("producto", producto);
        return "productForm";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/";
    }

}
