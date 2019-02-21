package com.agro.testes;

import com.agro.dao.LoteDao;
import com.agro.entidades.Lote;

public class LoteTestes {
	public static void main(String[] args) {
		LoteDao dao = new LoteDao();
		Lote lote = new Lote(144, "lio", "3344-3344", "Luiz", "3333333", true, false, true, false, "teste OBS");
		Lote lote2 = new Lote(1, null, null, null, null, true, false, true, true, "Oi Teste aki");
		dao.salvar(lote2);
		dao.salvar(lote);
		
	}
	
}
