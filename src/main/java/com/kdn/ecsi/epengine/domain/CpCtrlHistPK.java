package com.kdn.ecsi.epengine.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CP_CTRL_HIST database table.
 * 
 */
@Embeddable
public class CpCtrlHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EQP_NUM", unique=true, nullable=false)
	private Integer eqpNum;

	@Column(name="OUTLET_NUM", unique=true, nullable=false)
	private Integer outletNum;

	@Column(name="REGST_DAY", unique=true, nullable=false, length=8)
	private String regstDay;

	@Column(name="REGST_TIME", unique=true, nullable=false, length=6)
	private String regstTime;

	public CpCtrlHistPK() {
	}
	public Integer getEqpNum() {
		return this.eqpNum;
	}
	public void setEqpNum(Integer eqpNum) {
		this.eqpNum = eqpNum;
	}
	public Integer getOutletNum() {
		return this.outletNum;
	}
	public void setOutletNum(Integer outletNum) {
		this.outletNum = outletNum;
	}
	public String getRegstDay() {
		return this.regstDay;
	}
	public void setRegstDay(String regstDay) {
		this.regstDay = regstDay;
	}
	public String getRegstTime() {
		return this.regstTime;
	}
	public void setRegstTime(String regstTime) {
		this.regstTime = regstTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CpCtrlHistPK)) {
			return false;
		}
		CpCtrlHistPK castOther = (CpCtrlHistPK)other;
		return 
			(this.eqpNum == castOther.eqpNum)
			&& (this.outletNum == castOther.outletNum)
			&& this.regstDay.equals(castOther.regstDay)
			&& this.regstTime.equals(castOther.regstTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eqpNum;
		hash = hash * prime + this.outletNum;
		hash = hash * prime + this.regstDay.hashCode();
		hash = hash * prime + this.regstTime.hashCode();
		
		return hash;
	}
}