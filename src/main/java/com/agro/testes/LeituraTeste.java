package com.agro.testes;

import com.agro.dao.ConsumoDao;
import com.agro.dao.LeituraDao;
import com.agro.dao.LoteDao;
import com.agro.entidades.Consumo;
import com.agro.entidades.Leitura;
import com.agro.entidades.Lote;

import javassist.expr.Cast;

public class LeituraTeste {

	public static void main(String[] args) {
		// LoteDao daol = new LoteDao();
		// Lote lote3 = new Lote(124, "lio", "3344-3344", "Luiz", "3333333", true,
		// false, true, false, "teste OBS");

		// daol.salvar(lote3);
		LeituraDao dao = new LeituraDao();
		// dao.remove(2);
		LoteDao ldao = new LoteDao();
		ConsumoDao condao = new ConsumoDao();
		Consumo consumo = new Consumo();
		Leitura lei = new Leitura();

		Lote lote = new Lote();
		lote = ldao.byId(2);
		// connum.getLote();
		lote.getLote();
		Leitura leitura = new Leitura();

		leitura.setLote(lote);
		leitura.setNumLeitura(220);
		leitura.setReferencia(5);
		lei = dao.ById(1);
		leitura.setLote(lote);
		
		
		dao.salvar(leitura);

		consumo.setLote(lote);
		consumo.setReferencia(leitura);
		consumo.setM3(leitura.getNumLeitura() - lei.getNumLeitura());// nao consegui colocar aki os valores atual -
																		// antigo.
		consumo.setValor(consumo.getM3() * 0.70);

		condao.salvar(consumo);
		// System.out.println(lei.getLote().getLote());
		// System.out.println(leitura.getLote().getLote());
		// System.out.println(consumo.getLote().getLote().getLote());

	}

}
