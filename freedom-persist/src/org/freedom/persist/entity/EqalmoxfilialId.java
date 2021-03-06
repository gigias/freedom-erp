package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqalmoxfilialId generated by hbm2java
 */
@Embeddable
public class EqalmoxfilialId implements java.io.Serializable {

	private int codalmox;
	private short codfilial;
	private int codemp;
	private short codfilialaf;
	private int codempaf;

	public EqalmoxfilialId() {
	}

	public EqalmoxfilialId(int codalmox, short codfilial, int codemp,
			short codfilialaf, int codempaf) {
		this.codalmox = codalmox;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codfilialaf = codfilialaf;
		this.codempaf = codempaf;
	}

	@Column(name = "CODALMOX", nullable = false)
	public int getCodalmox() {
		return this.codalmox;
	}

	public void setCodalmox(int codalmox) {
		this.codalmox = codalmox;
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

	@Column(name = "CODFILIALAF", nullable = false)
	public short getCodfilialaf() {
		return this.codfilialaf;
	}

	public void setCodfilialaf(short codfilialaf) {
		this.codfilialaf = codfilialaf;
	}

	@Column(name = "CODEMPAF", nullable = false)
	public int getCodempaf() {
		return this.codempaf;
	}

	public void setCodempaf(int codempaf) {
		this.codempaf = codempaf;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqalmoxfilialId))
			return false;
		EqalmoxfilialId castOther = (EqalmoxfilialId) other;

		return (this.getCodalmox() == castOther.getCodalmox())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilialaf() == castOther.getCodfilialaf())
				&& (this.getCodempaf() == castOther.getCodempaf());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodalmox();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilialaf();
		result = 37 * result + this.getCodempaf();
		return result;
	}

}
