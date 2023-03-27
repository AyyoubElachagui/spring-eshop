package com.lus.dawm.eshopv1.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Produit implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public List<LigneCommande> getListLigneCommande() {
		return listLigneCommande;
	}

	public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
		this.listLigneCommande = listLigneCommande;
	}

	public List<Categorie> getCategories() {
		return Categories;
	}

	public void setCategories(List<Categorie> categories) {
		Categories = categories;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String designation;
	private String description;
	private int qte;
	
	@OneToMany(mappedBy = "produit", fetch = FetchType.EAGER)
	private List<LigneCommande> listLigneCommande;
	
	@ManyToMany
	@JoinTable(
	  name = "produit_category",
	  joinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "id"),
	  inverseJoinColumns = @JoinColumn(name = "categorie_id", referencedColumnName = "id")
	)
	private List<Categorie> Categories;

	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	
	public int getQte() {
		return qte;
	}
	
	public void setQte(int qte) {
		this.qte = qte;
	}
	
}
