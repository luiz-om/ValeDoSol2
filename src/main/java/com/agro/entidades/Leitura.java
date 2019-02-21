package com.agro.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Leitura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private Integer numLeitura;
	//@OneToOne(mappedBy="consumo", cascade = CascadeType.ALL)
	private int referencia;

	@ManyToOne
	@JoinColumn(name = "lote_id")
	private Lote lote;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Integer getNumLeitura() {
		return numLeitura;
	}

	public void setNumLeitura(Integer numLeitura) {
		this.numLeitura = numLeitura;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	
	



}
