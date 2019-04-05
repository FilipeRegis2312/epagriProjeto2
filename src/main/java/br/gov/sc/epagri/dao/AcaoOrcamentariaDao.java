package br.gov.sc.epagri.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import br.gov.sc.epagri.entity.AcaoOrcamentaria;
	
public class AcaoOrcamentariaDao extends BaseDao<AcaoOrcamentaria> {
	
	public AcaoOrcamentariaDao() {
	
	}
	
	public List<AcaoOrcamentaria> lista() {
		/* Método utilizado para pesquisa de dados em uma tabela, o retorno será todos os dados */
		List<AcaoOrcamentaria> lista = new ArrayList<>();
		try {
			Query query = em.createQuery("SELECT x FROM AcaoOrcamentaria x WHERE ROWNUM <= 50");
			lista = query.getResultList();
		} catch (Exception ex) {
			System.out.println("Erro ao consultar!" + ex);
		}
		return lista;
	} 	
	
	public int a(){
		return 1;
	}
}
