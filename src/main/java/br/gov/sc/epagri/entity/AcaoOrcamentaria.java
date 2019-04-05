package br.gov.sc.epagri.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ACAO_ORCAMENTARIA database table.
 * 
 */

@Entity
@Table(name = "ACAO_ORCAMENTARIA")
@NamedQuery(name = "AcaoOrcamentaria.findAll", query = "SELECT a FROM AcaoOrcamentaria a")
public class AcaoOrcamentaria implements Serializable {

	private static final long serialVersionUID = 1L;

	public int a(){
		return 1;
	}
	
	@Id
	@Column(name = "CD_ACAOORC")
	private int cdAcaoorc;

	@Column(name = "CD_ACAOORC_COTA")
	private Long cdAcaoorcCota;

	@Column(name = "CD_SDRGE")
	private Long cdSdrge;

	@Column(name = "CD_USU_ALT")
	private Long cdUsuAlt;

	@Column(name = "CD_USU_EXC")
	private Long cdUsuExc;

	@Column(name = "CD_USU_INC")
	private Long cdUsuInc;

	@Column(name = "DS_ACAOORC")
	private String dsAcaoorc;

	@Column(name = "DT_ALT")
	private Calendar dtAlt;

	@Column(name = "DT_EXC")
	private Calendar dtExc;

	@Column(name = "DT_INC")
	private Calendar dtInc;

	@Column(name = "ID_DESCENTRALIZADOR")
	private String idDescentralizador;

	@Column(name = "NR_ACAOORC")
	private Long nrAcaoorc;

	@Column(name = "SG_TIPO_ACAOORC")
	private String sgTipoAcaoorc;

	@Column(name = "ST_ATIVO_ACAOORC")
	private String stAtivoAcaoorc;
	
	public int getCdAcaoorc() {
		return cdAcaoorc;
	}

	public void setCdAcaoorc(int cdAcaoorc) {
		this.cdAcaoorc = cdAcaoorc;
	}
	

	public Long getCdAcaoorcCota() {
		return cdAcaoorcCota;
	}

	public void setCdAcaoorcCota(Long cdAcaoorcCota) {
		this.cdAcaoorcCota = cdAcaoorcCota;
	}

	public Long getCdSdrge() {
		return cdSdrge;
	}

	public void setCdSdrge(Long cdSdrge) {
		this.cdSdrge = cdSdrge;
	}

	public Long getCdUsuAlt() {
		return cdUsuAlt;
	}

	public void setCdUsuAlt(Long cdUsuAlt) {
		this.cdUsuAlt = cdUsuAlt;
	}

	public Long getCdUsuExc() {
		return cdUsuExc;
	}

	public void setCdUsuExc(Long cdUsuExc) {
		this.cdUsuExc = cdUsuExc;
	}

	public Long getCdUsuInc() {
		return cdUsuInc;
	}
	
	public String teste(){
		return "b";
	}

	public void setCdUsuInc(Long cdUsuInc) {
		this.cdUsuInc = cdUsuInc;
	}

	public String getDsAcaoorc() {
		return dsAcaoorc;
	}

	public void setDsAcaoorc(String dsAcaoorc) {
		this.dsAcaoorc = dsAcaoorc;
	}

	public Calendar getDtAlt() {
		return dtAlt;
	}

	public void setDtAlt(Calendar dtAlt) {
		this.dtAlt = dtAlt;
	}

	public Calendar getDtExc() {
		return dtExc;
	}

	public void setDtExc(Calendar dtExc) {
		this.dtExc = dtExc;
	}

	public Calendar getDtInc() {
		return dtInc;
	}

	public void setDtInc(Calendar dtInc) {
		this.dtInc = dtInc;
	}

	public String getIdDescentralizador() {
		return idDescentralizador;
	}

	public void setIdDescentralizador(String idDescentralizador) {
		this.idDescentralizador = idDescentralizador;
	}

	public Long getNrAcaoorc() {
		return nrAcaoorc;
	}

	public void setNrAcaoorc(Long nrAcaoorc) {
		this.nrAcaoorc = nrAcaoorc;
	}

	public String getSgTipoAcaoorc() {
		return sgTipoAcaoorc;
	}

	public void setSgTipoAcaoorc(String sgTipoAcaoorc) {
		this.sgTipoAcaoorc = sgTipoAcaoorc;
	}

	public String getStAtivoAcaoorc() {
		return stAtivoAcaoorc;
	}

	public void setStAtivoAcaoorc(String stAtivoAcaoorc) {
		this.stAtivoAcaoorc = stAtivoAcaoorc;
	}
	

}