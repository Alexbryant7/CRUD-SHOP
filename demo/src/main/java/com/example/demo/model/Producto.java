package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    // Constructor por defecto
    public Producto() {
    }

    // Constructor con todos los parámetros
    public Producto(Long id, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Constructor sin ID (para crear nuevos productos)
    public Producto(String name, String description, double price, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // getters y setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    // 🔥 Getters/setters de usuario (lo que faltaba)
    public User getUsuario() {
        return usuario;
    }
    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
