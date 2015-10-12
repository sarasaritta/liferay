package com.iswn.liferay.rh.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CONGES")
public class Conge implements Serializable {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="DATEDEB")
	private Date dateDeb;

	@Column(name="DATEFIN")
	private Date dateFin;
	
	@Column(name="TYPECONGE")
	private String typeConge;
	

	public Date getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTypeConge() {
		return typeConge;
	}
	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}
	@Column(name="Nom")
	private String nom;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
