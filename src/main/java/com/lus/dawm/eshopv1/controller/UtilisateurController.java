package com.lus.dawm.eshopv1.controller;

import com.lus.dawm.eshopv1.model.Utilisateur;
import com.lus.dawm.eshopv1.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/")
    public List<Utilisateur> getUsers(){
        return utilisateurService.getUsers();
    }

    @PostMapping("/")
    public Utilisateur addUser(Utilisateur user){
        return utilisateurService.addUser(user);
    }

    @DeleteMapping("/all")
    public void deleteAllUsers(){
        utilisateurService.deleteAll();
    }

}
