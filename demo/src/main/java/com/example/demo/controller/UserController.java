package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String mostrarLogin(Model model) {
    //
        return "login";
    }

    @PostMapping("/login")
    public String validarLogin(
            @RequestParam String name,
            @RequestParam String password,
            HttpSession session,
            Model model) {

        User user = userService.validarCredenciales(name, password);

        if (user != null) {
            session.setAttribute("usuarioLogueado", user); // Guarda el usuario
            return "redirect:/";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            //model.addAttribute("user", new User()); // Agregar el objeto User para evitar errores en la vista
            return "login";
        }
    }
   
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("usuarioLogueado"); //  elimina el usuario de la sesión
        return "redirect:/"; 
    }
    
    @GetMapping("/register")
    public String mostrarRegistro() {
        return "register";
    }

    @PostMapping("/register")
    public String registrarUsuario(@RequestParam String name, @RequestParam String password, Model model) {
        // Validar si ya existe
        if (userService.buscarPorNombre(name) != null) {
            model.addAttribute("error", "El nombre de usuario ya existe");
            return "register";
        }
        // Crear y guardar nuevo usuario
        User newUser = new User(name, password);
        userService.agregarUsuario(newUser);
        // Redirigir al login
        model.addAttribute("mensaje", "Cuenta creada correctamente. Inicia sesión.");
        return "login";
    }
    
}
