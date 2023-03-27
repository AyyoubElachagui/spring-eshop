package com.lus.dawm.eshopv1.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Panier implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dateCreation;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private Client client;
	
	@OneToMany(mappedBy = "panier", fetch = FetchType.EAGER)
	private List<LigneCommande> listLigneCommande;

	public void setId(Long id) {
		this.id = id;
	}

	public List<LigneCommande> getListLigneCommande() {
		return listLigneCommande;
	}

	public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
		this.listLigneCommande = listLigneCommande;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

}
