package com.agro.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Consumo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "lote_lote",referencedColumnName = "lote")
	private Lote lote;
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "leitura_ref", referencedColumnName = "referencia")
	private Leitura referencia;

	private Integer m3;
	private double valor;
	private String data_pagamento;
	private String observação;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Leitura getReferencia() {
		return referencia;
	}

	public void setReferencia(Leitura referencia) {
		this.referencia = referencia;
	}

	public Integer getM3() {
		return m3;
	}

	public void setM3(Integer m3) {
		this.m3 = m3;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(String data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public String getObservação() {
		return observação;
	}

	public void setObservação(String observação) {
		this.observação = observação;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

}
