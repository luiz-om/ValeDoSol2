package com.agro.dao;

import javax.persistence.EntityManager;

import com.agro.entidades.Lote;

import comm.agro.conexao.Connection;

public class LoteDao {

	public Lote salvar(Lote lote) {
		EntityManager em = new Connection().getConnection();

		try {
			em.getTransaction().begin();
			em.persist(lote);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.err.println(e);
		} finally {
			em.close();
		}
		return lote;
	}

	public Lote byId(Integer id) {
		EntityManager em = new Connection().getConnection();
		Lote lote = null;
		try {
			lote = em.find(Lote.class, id);
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return lote;
	}
	public Lote byLote(Integer lote) {
		EntityManager em = new Connection().getConnection();
		Lote lot = null;
		try {
			lot = em.find(Lote.class, lote);
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return lot;
	}

}
