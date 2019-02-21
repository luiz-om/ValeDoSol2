package com.agro.dao;

import javax.persistence.EntityManager;

import com.agro.entidades.Leitura;

import comm.agro.conexao.Connection;



public class LeituraDao {
	
	public Leitura salvar(Leitura leitura) {
		EntityManager em = new Connection().getConnection();

		try {
			em.getTransaction().begin();
			em.persist(leitura);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e);
		} finally {
			em.close();
		}
		return leitura;
	}
	
	public Leitura ById(Integer id) {
		EntityManager em = new Connection().getConnection();
		Leitura  leitura = null;
		try {
			leitura = em.find(Leitura.class,id);
						
		} catch (Exception e) {
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return leitura;
	}
	public Leitura ByLote(Integer lote) {
		EntityManager em = new Connection().getConnection();
		Leitura  leitura = null;
		try {
			leitura = em.find(Leitura.class, lote);
		} catch (Exception e) {
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return leitura;
	}
	public Leitura remove(Integer id) {
		EntityManager em = new Connection().getConnection();
		Leitura  leitura = null;
		try {
			em.getTransaction().begin();
			leitura = em.find(Leitura.class, id);
			em.remove(leitura);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			em.close();
			
		}
		return leitura;
	}

}
