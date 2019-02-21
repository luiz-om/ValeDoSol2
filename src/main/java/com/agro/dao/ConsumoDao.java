package com.agro.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.agro.entidades.Consumo;

import comm.agro.conexao.Connection;

public class ConsumoDao {

	public Consumo salvar(Consumo consumo) {
		EntityManager em = new Connection().getConnection();

		try {
			em.getTransaction().begin();
			em.persist(consumo);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return consumo;
	}
	public Consumo ById(Integer id) {
		EntityManager em = new Connection().getConnection();
		Consumo consumo = null;
		try {
			consumo = em.find(Consumo.class, id);
			
		} catch (Exception e) {
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return null;
		
	}

	public Consumo remove(Integer id) {
		EntityManager em = new Connection().getConnection();
		Consumo consumo = null;
		try {
			em.getTransaction().begin();
			consumo = em.find(Consumo.class,id);
			em.remove(consumo);
			em.getTransaction().commit();
		}catch (Exception e) {
		em.getTransaction().rollback();	
		}finally {
			em.close();
		}
		return consumo;
	}
}
