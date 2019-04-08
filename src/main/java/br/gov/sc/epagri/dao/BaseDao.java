package br.gov.sc.epagri.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.gov.sc.epagri.entity.AcaoOrcamentaria;
import br.gov.sc.epagri.jpautil.JPAUtil;

public class BaseDao<T> {

	protected EntityManager em;
	
	public BaseDao() {
		em = new JPAUtil().createEntityManager();
	}
	public boolean insert(T obj) {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Erro");
			em.getTransaction().rollback();
			return false;
		} finally {
			em.close();
		}
	}

	public boolean update(T obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao alterar");
			em.getTransaction().rollback();
			return false;
		} finally {
			em.close();
		}
	}

	public boolean delete(T obj) {
		try {
			em.getTransaction().begin();
			Object obj2 = em.merge(obj);
			em.remove(obj2);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao deletar");
			em.getTransaction().rollback();
			return false;
		} finally {
			em.close();
		}
	}

	public static void main(String[] args) {
/*
		BaseDao dao = new BaseDao();
		System.out.println("aaaa");

		AcaoOrcamentariaDao aDao = new AcaoOrcamentariaDao();
		AcaoOrcamentaria aO = new AcaoOrcamentaria();

		aO.setCdAcaoorc(656897);

		aDao.insert(aO);*/
	}
}
