
package com.agro.testes;

import com.agro.dao.ConsumoDao;
import com.agro.dao.LeituraDao;
import com.agro.dao.LoteDao;
import com.agro.entidades.Consumo;
import com.agro.entidades.Leitura;
import com.agro.entidades.Lote;

public class ConsumoTeste {
	public static void main(String[] args) {
		Consumo consumo = new Consumo();
		ConsumoDao dao = new ConsumoDao();
		LoteDao ldao = new LoteDao();
		LeituraDao leidao = new LeituraDao();
		Leitura leitura = new Leitura();
		Lote lote = new Lote();
		// = ldao.byId(2);
		lote.setLote(144);
		leitura.setLote(lote);;
		//leitura.setReferencia(2);
		consumo.setM3(4);
		consumo.setLote(lote);
		consumo.setData_pagamento("10-01");
	//	consumo.setReferencia(leitura);
		consumo.setValor(23);
		//consumo.setLote(leitura);
		consumo.setObservação("Teste");

		dao.salvar(consumo);
		
	}
}
