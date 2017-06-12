package com.non.entity;

/**
 * Ban entity. @author MyEclipse Persistence Tools
 */

public class Ban implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ban;
	private String tech;

	// Constructors

	/** default constructor */
	public Ban() {
	}

	/** full constructor */
	public Ban(String ban, String tech) {
		this.ban = ban;
		this.tech = tech;
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

	public String getTech() {
		return this.tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}