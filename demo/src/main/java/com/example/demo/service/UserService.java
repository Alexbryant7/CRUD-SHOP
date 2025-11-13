package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.respository.UserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {

    
    @Autowired
    private UserRepository userRepo;
    

    public void agregarUsuario(User user) {
        userRepo.save(user);
    }

    public User validarCredenciales(String user, String password){
       return userRepo.findByNameAndPassword(user, password);
    }
    
    public User buscarPorNombre(String name) {
        return userRepo.findByName(name);
    }

    public List<User> getUsuarios() {
        return userRepo.findAll();
    }

}
