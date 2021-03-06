package com.fijib.impl.persistence.entity;

// Generated Aug 21, 2014 11:10:22 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EnvoiNonInscrit generated by hbm2java
 */
@Entity
@Table(name = "envoi_non_inscrit", catalog = "db_fijib")
public class EnvoiNonInscrit implements java.io.Serializable {

	private String idEnvoiNs;
	private Agentguichet agentguichet;
	private String cinBenef;
	private String cinEnv;
	private String codeSourceEnvoi;
	private Date dateEnv;
	private boolean envoiValide;
	private double frais;
	private boolean isPaypal;
	private double montant;
	private Set<Retrait> retraits = new HashSet<Retrait>(0);

	public EnvoiNonInscrit() {
	}

	//zz
	public EnvoiNonInscrit(String idEnvoiNs, double montant, double frais,
			String cinBenef, String cinEnv, Date dateEnv, boolean isPaypal,
			String codeSourceEnvoi, boolean envoiValide) {
		this.idEnvoiNs = idEnvoiNs;
		this.montant = montant;
		this.frais = frais;
		this.cinBenef = cinBenef;
		this.cinEnv = cinEnv;
		this.dateEnv = dateEnv;
		this.isPaypal = isPaypal;
		this.codeSourceEnvoi = codeSourceEnvoi;
		this.envoiValide = envoiValide;
	}
	
	//tt
	public EnvoiNonInscrit(String idEnvoiNs, double montant, double frais,
			String cinBenef, String cinEnv, Date dateEnv, boolean isPaypal,
			String codeSourceEnvoi, boolean envoiValide, Set<Retrait> retraits) {
		this.idEnvoiNs = idEnvoiNs;
		this.montant = montant;
		this.frais = frais;
		this.cinBenef = cinBenef;
		this.cinEnv = cinEnv;
		this.dateEnv = dateEnv;
		this.isPaypal = isPaypal;
		this.codeSourceEnvoi = codeSourceEnvoi;
		this.envoiValide = envoiValide;
		this.retraits = retraits;
	}
	
	public EnvoiNonInscrit(String idEnvoiNs, Agentguichet agentguichet,
			String cinBenef, String cinEnv, String codeSourceEnvoi,
			Date dateEnv, boolean envoiValide, double frais, boolean isPaypal,
			double montant) {
		this.idEnvoiNs = idEnvoiNs;
		this.agentguichet = agentguichet;
		this.cinBenef = cinBenef;
		this.cinEnv = cinEnv;
		this.codeSourceEnvoi = codeSourceEnvoi;
		this.dateEnv = dateEnv;
		this.envoiValide = envoiValide;
		this.frais = frais;
		this.isPaypal = isPaypal;
		this.montant = montant;
	}

	public EnvoiNonInscrit(String idEnvoiNs, Agentguichet agentguichet,
			String cinBenef, String cinEnv, String codeSourceEnvoi,
			Date dateEnv, boolean envoiValide, double frais, boolean isPaypal,
			double montant, Set<Retrait> retraits) {
		this.idEnvoiNs = idEnvoiNs;
		this.agentguichet = agentguichet;
		this.cinBenef = cinBenef;
		this.cinEnv = cinEnv;
		this.codeSourceEnvoi = codeSourceEnvoi;
		this.dateEnv = dateEnv;
		this.envoiValide = envoiValide;
		this.frais = frais;
		this.isPaypal = isPaypal;
		this.montant = montant;
		this.retraits = retraits;
	}

	@Id
	@Column(name = "idEnvoiNS", unique = true, nullable = false, length = 100)
	public String getIdEnvoiNs() {
		return this.idEnvoiNs;
	}

	public void setIdEnvoiNs(String idEnvoiNs) {
		this.idEnvoiNs = idEnvoiNs;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cin_agent" )
	public Agentguichet getAgentguichet() {
		return this.agentguichet;
	}

	public void setAgentguichet(Agentguichet agentguichet) {
		this.agentguichet = agentguichet;
	}

	@Column(name = "cin_benef",  length = 50)
	public String getCinBenef() {
		return this.cinBenef;
	}

	public void setCinBenef(String cinBenef) {
		this.cinBenef = cinBenef;
	}

	@Column(name = "cin_env",   length = 50)
	public String getCinEnv() {
		return this.cinEnv;
	}

	public void setCinEnv(String cinEnv) {
		this.cinEnv = cinEnv;
	}

	@Column(name = "code_source_envoi",   length = 100)
	public String getCodeSourceEnvoi() {
		return this.codeSourceEnvoi;
	}

	public void setCodeSourceEnvoi(String codeSourceEnvoi) {
		this.codeSourceEnvoi = codeSourceEnvoi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateEnv",   length = 10)
	public Date getDateEnv() {
		return this.dateEnv;
	}

	public void setDateEnv(Date dateEnv) {
		this.dateEnv = dateEnv;
	}

	@Column(name = "Envoi_valide" )
	public boolean isEnvoiValide() {
		return this.envoiValide;
	}

	public void setEnvoiValide(boolean envoiValide) {
		this.envoiValide = envoiValide;
	}

	@Column(name = "frais",   precision = 22, scale = 0)
	public double getFrais() {
		return this.frais;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	@Column(name = "isPaypal" )
	public boolean isIsPaypal() {
		return this.isPaypal;
	}

	public void setIsPaypal(boolean isPaypal) {
		this.isPaypal = isPaypal;
	}

	@Column(name = "montant",  precision = 22, scale = 0)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "envoiNonInscrit")
	public Set<Retrait> getRetraits() {
		return this.retraits;
	}

	public void setRetraits(Set<Retrait> retraits) {
		this.retraits = retraits;
	}

}
