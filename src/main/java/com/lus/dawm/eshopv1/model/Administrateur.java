package com.lus.dawm.eshopv1.model;

import jakarta.persistence.Entity;

import java.io.Serializable;


@Entity
public class Administrateur extends Utilisateur implements Serializable {
	
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
