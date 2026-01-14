package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    // ✅ Constructor vacío requerido por JPA
    public User() {
    }

    // Constructor con parámetros (útil para crear usuarios manualmente)
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

