package com.agro.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lote implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int lote;
	private String titular;
	@Column
	private String telefoneTitular;
	@Column
	private String representante;
	@Column
	private String telefoneRepresentante;
	@Column
	private boolean socio;
	@Column
	private boolean cavalete;
	@Column
	private boolean consumidor;
	@Column
	private boolean pronaf;
	@Column
	private String observacoes;

	@OneToMany(mappedBy = "lote", cascade = CascadeType.ALL)
	private List<Leitura> leitura = new ArrayList<Leitura>();

	public Lote() {

	}

	public Lote(int lote, String titular, String telefoneTitular, String representante, String telefoneRepresentante,
			boolean socio, boolean cavalete, boolean consumidor, boolean pronaf, String observacoes) {
		super();
		this.lote = lote;
		this.titular = titular;
		this.telefoneTitular = telefoneTitular;
		this.representante = representante;
		this.telefoneRepresentante = telefoneRepresentante;
		this.socio = socio;
		this.cavalete = cavalete;
		this.consumidor = consumidor;
		this.pronaf = pronaf;
		this.observacoes = observacoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTelefoneTitular() {
		return telefoneTitular;
	}

	public void setTelefoneTitular(String telefoneTitular) {
		this.telefoneTitular = telefoneTitular;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getTelefoneRepresentante() {
		return telefoneRepresentante;
	}

	public void setTelefoneRepresentante(String telefoneRepresentante) {
		this.telefoneRepresentante = telefoneRepresentante;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public boolean isCavalete() {
		return cavalete;
	}

	public void setCavalete(boolean cavalete) {
		this.cavalete = cavalete;
	}

	public boolean isConsumidor() {
		return consumidor;
	}

	public void setConsumidor(boolean consumidor) {
		this.consumidor = consumidor;
	}

	public boolean isPronaf() {
		return pronaf;
	}

	public void setPronaf(boolean pronaf) {
		this.pronaf = pronaf;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Leitura> getLeitura() {
		return leitura;
	}

	public void setLeitura(List<Leitura> leitura) {
		this.leitura = leitura;
	}

}
