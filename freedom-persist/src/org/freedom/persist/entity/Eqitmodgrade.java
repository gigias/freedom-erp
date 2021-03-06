package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqitmodgrade generated by hbm2java
 */
@Entity
@Table(name = "EQITMODGRADE")
public class Eqitmodgrade implements java.io.Serializable {

	private EqitmodgradeId id;
	private Eqvargrade eqvargrade;
	private Eqmodgrade eqmodgrade;
	private int ordemitmodg;
	private String refitmodg;
	private int codempvg;
	private short codfilialvg;
	private String codfabitmodg;
	private String codbaritmodg;
	private String descitmodg;
	private String desccompitmodg;
	private BigDecimal precoitvarg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqitmodgrade() {
	}

	public Eqitmodgrade(EqitmodgradeId id, Eqvargrade eqvargrade,
			Eqmodgrade eqmodgrade, int ordemitmodg, int codempvg,
			short codfilialvg, String descitmodg, BigDecimal precoitvarg,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.eqmodgrade = eqmodgrade;
		this.ordemitmodg = ordemitmodg;
		this.codempvg = codempvg;
		this.codfilialvg = codfilialvg;
		this.descitmodg = descitmodg;
		this.precoitvarg = precoitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitmodgrade(EqitmodgradeId id, Eqvargrade eqvargrade,
			Eqmodgrade eqmodgrade, int ordemitmodg, String refitmodg,
			int codempvg, short codfilialvg, String codfabitmodg,
			String codbaritmodg, String descitmodg, String desccompitmodg,
			BigDecimal precoitvarg, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.eqmodgrade = eqmodgrade;
		this.ordemitmodg = ordemitmodg;
		this.refitmodg = refitmodg;
		this.codempvg = codempvg;
		this.codfilialvg = codfilialvg;
		this.codfabitmodg = codfabitmodg;
		this.codbaritmodg = codbaritmodg;
		this.descitmodg = descitmodg;
		this.desccompitmodg = desccompitmodg;
		this.precoitvarg = precoitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "coditmodg", column = @Column(name = "CODITMODG", nullable = false)),
			@AttributeOverride(name = "codmodg", column = @Column(name = "CODMODG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitmodgradeId getId() {
		return this.id;
	}

	public void setId(EqitmodgradeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG", referencedColumnName = "CODVARG", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqvargrade getEqvargrade() {
		return this.eqvargrade;
	}

	public void setEqvargrade(Eqvargrade eqvargrade) {
		this.eqvargrade = eqvargrade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODG", referencedColumnName = "CODMODG", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqmodgrade getEqmodgrade() {
		return this.eqmodgrade;
	}

	public void setEqmodgrade(Eqmodgrade eqmodgrade) {
		this.eqmodgrade = eqmodgrade;
	}

	@Column(name = "ORDEMITMODG", nullable = false)
	public int getOrdemitmodg() {
		return this.ordemitmodg;
	}

	public void setOrdemitmodg(int ordemitmodg) {
		this.ordemitmodg = ordemitmodg;
	}

	@Column(name = "REFITMODG", length = 6)
	public String getRefitmodg() {
		return this.refitmodg;
	}

	public void setRefitmodg(String refitmodg) {
		this.refitmodg = refitmodg;
	}

	@Column(name = "CODEMPVG", nullable = false)
	public int getCodempvg() {
		return this.codempvg;
	}

	public void setCodempvg(int codempvg) {
		this.codempvg = codempvg;
	}

	@Column(name = "CODFILIALVG", nullable = false)
	public short getCodfilialvg() {
		return this.codfilialvg;
	}

	public void setCodfilialvg(short codfilialvg) {
		this.codfilialvg = codfilialvg;
	}

	@Column(name = "CODFABITMODG", length = 6)
	public String getCodfabitmodg() {
		return this.codfabitmodg;
	}

	public void setCodfabitmodg(String codfabitmodg) {
		this.codfabitmodg = codfabitmodg;
	}

	@Column(name = "CODBARITMODG", length = 6)
	public String getCodbaritmodg() {
		return this.codbaritmodg;
	}

	public void setCodbaritmodg(String codbaritmodg) {
		this.codbaritmodg = codbaritmodg;
	}

	@Column(name = "DESCITMODG", nullable = false, length = 20)
	public String getDescitmodg() {
		return this.descitmodg;
	}

	public void setDescitmodg(String descitmodg) {
		this.descitmodg = descitmodg;
	}

	@Column(name = "DESCCOMPITMODG", length = 50)
	public String getDesccompitmodg() {
		return this.desccompitmodg;
	}

	public void setDesccompitmodg(String desccompitmodg) {
		this.desccompitmodg = desccompitmodg;
	}

	@Column(name = "PRECOITVARG", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPrecoitvarg() {
		return this.precoitvarg;
	}

	public void setPrecoitvarg(BigDecimal precoitvarg) {
		this.precoitvarg = precoitvarg;
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

	@Column(name = "IDUSUINS", nullable = false, length = 8)
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

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
