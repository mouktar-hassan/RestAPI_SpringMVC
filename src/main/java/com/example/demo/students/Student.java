package com.example.demo.students;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String passportNumber;
	
	public Student() {}

	/**
	 * @param id
	 * @param nom
	 * @param passportNumber
	 */
	public Student(Long id, String nom, String passportNumber) {
		super();
		this.id = id;
		this.nom = nom;
		this.passportNumber = passportNumber;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the passportNumber
	 */
	public String getPassportNumber() {
		return passportNumber;
	}

	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	//Commentaire important
	/*
	 * @Entity: Spécifie que la classe est une entité. Cette annotation est appliquée à la classe d'entité.
@Id: Spécifie la clé primaire d'une entité.
@GeneratedValue: Fournit la spécification de stratégies de génération pour les valeurs des clés primaires.
	 */

}
