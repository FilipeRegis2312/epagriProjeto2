package br.gov.sc.epagri.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import br.gov.sc.epagri.entity.AcaoOrcamentaria;

public class AcaoOrcamentariaDao extends BaseDao<AcaoOrcamentaria> {

	public AcaoOrcamentariaDao() {

	}

	/*public List<AcaoOrcamentaria> listar() {
		
		List<AcaoOrcamentaria> lista = new ArrayList<>();
		try {
			Query query = em.createQuery("SELECT x FROM AcaoOrcamentaria x WHERE ROWNUM <= 50");
			lista = query.getResultList();
		} catch (Exception ex) {
			System.out.println("Erro ao consultar!" + ex);
		}
		return lista;
	}*/

	@SuppressWarnings("unchecked")
	public List<AcaoOrcamentaria> lista(int first, int pageSize, String sortField, boolean asc) {
		Session s = em.unwrap(Session.class);

		@SuppressWarnings("deprecation")
		Criteria c = s.createCriteria(AcaoOrcamentaria.class);

		c.setFirstResult(first);
		c.setMaxResults(pageSize);

		if (sortField != null) {
			if (asc) {
				c.addOrder(Order.asc(sortField));
			} else {
				c.addOrder(Order.desc(sortField));
			}
		}

		return c.list();
	}

	public Long getTotalRegistros() {
		Session s = em.unwrap(Session.class);
		@SuppressWarnings("deprecation")
		Criteria c = s.createCriteria(AcaoOrcamentaria.class);

		c.setProjection(Projections.rowCount());

		return (Long) c.uniqueResult();
	}

}
