package com.entity;

/**
 * Banji entity. @author MyEclipse Persistence Tools
 */

public class Banji implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ban;
	private String tec;

	// Constructors

	/** default constructor */
	public Banji() {
	}

	/** full constructor */
	public Banji(String ban, String tec) {
		this.ban = ban;
		this.tec = tec;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBan() {
		return this.ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getTec() {
		return this.tec;
	}

	public void setTec(String tec) {
		this.tec = tec;
	}

}