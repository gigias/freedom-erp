package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * CbcontaextId generated by hbm2java
 */
public class CbcontaextId implements java.io.Serializable {

	private String codcontabil;
	private int codemp;
	private short codfilial;

	public CbcontaextId() {
	}

	public CbcontaextId(String codcontabil, int codemp, short codfilial) {
		this.codcontabil = codcontabil;
		this.codemp = codemp;
		this.codfilial = codfilial;
	}

	public String getCodcontabil() {
		return this.codcontabil;
	}

	public void setCodcontabil(String codcontabil) {
		this.codcontabil = codcontabil;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CbcontaextId))
			return false;
		CbcontaextId castOther = (CbcontaextId) other;

		return ((this.getCodcontabil() == castOther.getCodcontabil()) || (this
				.getCodcontabil() != null && castOther.getCodcontabil() != null && this
				.getCodcontabil().equals(castOther.getCodcontabil())))
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodcontabil() == null ? 0 : this.getCodcontabil()
						.hashCode());
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		return result;
	}

}
