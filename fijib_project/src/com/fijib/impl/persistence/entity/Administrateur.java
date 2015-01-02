package com.fijib.impl.persistence.entity;

// Generated Aug 21, 2014 11:10:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Administrateur generated by hbm2java
 */
@Entity
@Table(name = "administrateur", catalog = "db_fijib")
public class Administrateur implements java.io.Serializable {

	private String cin;
	private Utilisateur utilisateur;
	private Date dateRecrutement;
	private String email;
	private String firstName;
	private String lastName;

	public Administrateur() {
	}

	public Administrateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Administrateur(Utilisateur utilisateur, Date dateRecrutement,
			String email, String firstName, String lastName) {
		this.utilisateur = utilisateur;
		this.dateRecrutement = dateRecrutement;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "utilisateur"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "CIN", unique = true, nullable = false, length = 254)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateRecrutement", length = 19)
	public Date getDateRecrutement() {
		return this.dateRecrutement;
	}

	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}

	@Column(name = "Email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "FirstName", length = 254)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 254)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}