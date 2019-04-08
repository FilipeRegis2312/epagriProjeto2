package br.gov.sc.epagri.bean;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;

import br.gov.sc.epagri.dao.AcaoOrcamentariaDao;
import br.gov.sc.epagri.entity.AcaoOrcamentaria;

@ManagedBean
@ViewScoped
public class AcaoOrcamentariaBean {

	AcaoOrcamentariaDao dao;

	private List<AcaoOrcamentaria> lista;
	private LazyDataModel<AcaoOrcamentaria> dataModel;

	@PostConstruct
	public void init() {
		dao = new AcaoOrcamentariaDao();
		// setLista(dao.lista());
		this.dataModel = new LazyDataModel<AcaoOrcamentaria>() {
			private static final long serialVersionUID = 1L;

			@Override
			public List<AcaoOrcamentaria> load(int first, int pageSize, String sortField,
					org.primefaces.model.SortOrder sortOrder, Map<String, Object> filters) {
				setRowCount(dao.getTotalRegistros().intValue());
				return dao.lista(first, pageSize, sortField,
						org.primefaces.model.SortOrder.ASCENDING.equals(sortOrder));
			}
		};
	}
	
	public void excluir(AcaoOrcamentaria obj){ 
		dao.delete(obj);
		init();
	}
	
	public LazyDataModel<AcaoOrcamentaria> getDataModel() {
		return dataModel;
	}

	public void setDataModel(LazyDataModel<AcaoOrcamentaria> dataModel) {
		this.dataModel = dataModel;
	}

	public List<AcaoOrcamentaria> getLista() {
		return lista;
	}

	public void setLista(List<AcaoOrcamentaria> lista) {
		this.lista = lista;
	}

}
