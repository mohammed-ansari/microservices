package com.cis.mansari.microservices.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MST_STATE")
public class MstState implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1594229508167755388L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATE_ID")
	private Long stateId;
	@Column(name = "STATE_CODE")
	private String stateCode;
	@Column(name = "STATE_NAME")
	private String stateName;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "UPDATED_BY")
	private String updateBy;
	@Column(name = "UPDATED_DATE")
	private Date updateDate;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "COUNTRY_CODE_ID")
	private Integer countryCodeId;

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getCountryCodeId() {
		return countryCodeId;
	}

	public void setCountryCodeId(Integer countryCodeId) {
		this.countryCodeId = countryCodeId;
	}


}
