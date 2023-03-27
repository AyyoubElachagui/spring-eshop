package com.lus.dawm.eshopv1.service;

import com.lus.dawm.eshopv1.model.Utilisateur;
import com.lus.dawm.eshopv1.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur addUser(Utilisateur user) {
        System.out.println(user);
        return utilisateurRepository.save(user);
    }

    public void deleteAll(){
        utilisateurRepository.deleteAll();
    }

    public List<Utilisateur> getUsers() {
        return (List<Utilisateur>) utilisateurRepository.findAll();
    }

}
