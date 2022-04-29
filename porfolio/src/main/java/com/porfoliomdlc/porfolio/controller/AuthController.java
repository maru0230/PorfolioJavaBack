


package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Usuario;
import com.porfoliomdlc.porfolio.model.dto.UserDto;
import com.porfoliomdlc.porfolio.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    AuthService service;
    private Usuario usuario;
   
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto){
        return service.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
