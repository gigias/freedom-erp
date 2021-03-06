package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpcomprapedId generated by hbm2java
 */
@Embeddable
public class CpcomprapedId implements java.io.Serializable {

	private int codcompra;
	private int coditcompra;
	private short codfilial;
	private int codemp;
	private int codcomprapc;
	private int coditcomprapc;
	private short codfilialpc;
	private int codemppc;

	public CpcomprapedId() {
	}

	public CpcomprapedId(int codcompra, int coditcompra, short codfilial,
			int codemp, int codcomprapc, int coditcomprapc, short codfilialpc,
			int codemppc) {
		this.codcompra = codcompra;
		this.coditcompra = coditcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codcomprapc = codcomprapc;
		this.coditcomprapc = coditcomprapc;
		this.codfilialpc = codfilialpc;
		this.codemppc = codemppc;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	@Column(name = "CODITCOMPRA", nullable = false)
	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODCOMPRAPC", nullable = false)
	public int getCodcomprapc() {
		return this.codcomprapc;
	}

	public void setCodcomprapc(int codcomprapc) {
		this.codcomprapc = codcomprapc;
	}

	@Column(name = "CODITCOMPRAPC", nullable = false)
	public int getCoditcomprapc() {
		return this.coditcomprapc;
	}

	public void setCoditcomprapc(int coditcomprapc) {
		this.coditcomprapc = coditcomprapc;
	}

	@Column(name = "CODFILIALPC", nullable = false)
	public short getCodfilialpc() {
		return this.codfilialpc;
	}

	public void setCodfilialpc(short codfilialpc) {
		this.codfilialpc = codfilialpc;
	}

	@Column(name = "CODEMPPC", nullable = false)
	public int getCodemppc() {
		return this.codemppc;
	}

	public void setCodemppc(int codemppc) {
		this.codemppc = codemppc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpcomprapedId))
			return false;
		CpcomprapedId castOther = (CpcomprapedId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodcomprapc() == castOther.getCodcomprapc())
				&& (this.getCoditcomprapc() == castOther.getCoditcomprapc())
				&& (this.getCodfilialpc() == castOther.getCodfilialpc())
				&& (this.getCodemppc() == castOther.getCodemppc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodcomprapc();
		result = 37 * result + this.getCoditcomprapc();
		result = 37 * result + this.getCodfilialpc();
		result = 37 * result + this.getCodemppc();
		return result;
	}

}
