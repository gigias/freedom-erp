package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Crfeedback generated by hbm2java
 */
@Entity
@Table(name = "CRFEEDBACK")
public class Crfeedback implements java.io.Serializable {

	private long id;
	private Crpessoa crpessoa;
	private Sgfilial sgfilial;
	private Crmotivofb crmotivofb;
	private String nome;
	private String mensagem;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Crfeedback() {
	}

	public Crfeedback(long id, Crpessoa crpessoa, Sgfilial sgfilial,
			Crmotivofb crmotivofb, String nome, String mensagem, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.crpessoa = crpessoa;
		this.sgfilial = sgfilial;
		this.crmotivofb = crmotivofb;
		this.nome = nome;
		this.mensagem = mensagem;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crfeedback(long id, Crpessoa crpessoa, Sgfilial sgfilial,
			Crmotivofb crmotivofb, String nome, String mensagem, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.crpessoa = crpessoa;
		this.sgfilial = sgfilial;
		this.crmotivofb = crmotivofb;
		this.nome = nome;
		this.mensagem = mensagem;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "EMAILPESSOA", referencedColumnName = "EMAILPESSOA", nullable = false),
			@JoinColumn(name = "CODFILIALPE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPE", referencedColumnName = "CODEMP", nullable = false) })
	public Crpessoa getCrpessoa() {
		return this.crpessoa;
	}

	public void setCrpessoa(Crpessoa crpessoa) {
		this.crpessoa = crpessoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MOTIVO", nullable = false)
	public Crmotivofb getCrmotivofb() {
		return this.crmotivofb;
	}

	public void setCrmotivofb(Crmotivofb crmotivofb) {
		this.crmotivofb = crmotivofb;
	}

	@Column(name = "NOME", nullable = false, length = 128)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "MENSAGEM", nullable = false, length = 10000)
	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
