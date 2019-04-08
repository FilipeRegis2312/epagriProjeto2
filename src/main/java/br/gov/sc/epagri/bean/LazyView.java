package br.gov.sc.epagri.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;

import br.gov.sc.epagri.entity.AcaoOrcamentaria;

@ManagedBean(name="dtLazyView")
@ViewScoped
public class LazyView implements Serializable{
	
	private LazyDataModel<AcaoOrcamentaria> lazyModel;
	
	private AcaoOrcamentaria acaoSelecionada;
	
	@ManagedProperty("#{acaoOrcamentariaBean}")
    private AcaoOrcamentariaBean service;
	

}
