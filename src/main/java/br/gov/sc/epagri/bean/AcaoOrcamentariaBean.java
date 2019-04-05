package br.gov.sc.epagri.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.gov.sc.epagri.dao.AcaoOrcamentariaDao;
import br.gov.sc.epagri.entity.AcaoOrcamentaria;

@ManagedBean
@ViewScoped
public class AcaoOrcamentariaBean {
	
	AcaoOrcamentariaDao dao;

	private List<AcaoOrcamentaria> lista;
	
	@PostConstruct
	public void init() {
		dao = new AcaoOrcamentariaDao();
	}

	public List<AcaoOrcamentaria> getLista() {
		return dao.lista();
	}

	public void setLista(List<AcaoOrcamentaria> lista) {
		this.lista = lista;
	}

}
