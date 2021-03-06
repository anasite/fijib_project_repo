package com.fijib.impl.persistence.entity;

// Generated Aug 21, 2014 11:10:22 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "db_fijib")
public class Role implements java.io.Serializable {

	private Integer idRole;
	private Utilisateur utilisateur;
	private String nomRole;

	public Role() {
	}

	public Role(Utilisateur utilisateur, String nomRole) {
		this.utilisateur = utilisateur;
		this.nomRole = nomRole;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRole", unique = true, nullable = false)
	public Integer getIdRole() {
		return this.idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CIN")
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Column(name = "nomRole", length = 254)
	public String getNomRole() {
		return this.nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

}
