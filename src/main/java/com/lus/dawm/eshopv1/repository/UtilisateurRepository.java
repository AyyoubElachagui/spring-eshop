package com.lus.dawm.eshopv1.repository;

import com.lus.dawm.eshopv1.model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, UUID> {

    @Query("SELECT u FROM Utilisateur u WHERE u.nom = ?1 and u.prenom = ?2")
    Utilisateur findUserByFirstNameAndLastName(String nom, String prenom);

    @Query("SELECT u FROM Utilisateur u WHERE u.nom = ?1 ORDER BY u.prenom asc")
    List<Utilisateur> findUsersByFirstName(String nom);
}
