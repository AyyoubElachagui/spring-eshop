package com.lus.dawm.eshopv1.model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;


@Entity
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private Long id;
	private LocalDateTime dateCreation;
	private LocalDateTime dateLivraison;
	private String adresseLivraison;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;
	
	@OneToMany(mappedBy = "commande", fetch = FetchType.EAGER)
	private List<LigneCommande> listLigneCommande;
	

	public List<LigneCommande> getListLigneCommande() {
		return listLigneCommande;
	}

	public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
		this.listLigneCommande = listLigneCommande;
	}

	public long getId() {
		return id;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	public LocalDateTime getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	public LocalDateTime getDateLivraison() {
		return dateLivraison;
	}
	
	public void setDateLivraison(LocalDateTime dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	
	
	public String getAdresseLivraison() {
		return adresseLivraison;
	}
	
	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

}
