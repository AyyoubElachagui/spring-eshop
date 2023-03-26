package com.lus.dawm.eshopv1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private Long id;
	private String designation;
	private String description;
	
	@OneToMany
	private List<Categorie> subCategorie;

	@OneToOne
	private Categorie parentCategorie;

	@ManyToMany
	@JoinTable(
	  name = "produit_category",
	  joinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "id"),
	  inverseJoinColumns = @JoinColumn(name = "categorie_id", referencedColumnName = "id")
	)
	private List<Produit> produits;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public Categorie getParentCategorie() {
		return parentCategorie;
	}

	public void setParentCategorie(Categorie parentCategorie) {
		this.parentCategorie = parentCategorie;
	}

	public List<Categorie> getSubCategorie() {
		return subCategorie;
	}

	public void setSubCategorie(List<Categorie> subCategorie) {
		this.subCategorie = subCategorie;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
