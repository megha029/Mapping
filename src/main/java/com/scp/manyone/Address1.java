package com.scp.manyone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Address_3")

public class Address1 {

	@Id
	@GeneratedValue
	@Column(name = "Address_ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COUNTRY")
	private String country;

	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address1(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address1 [name=" + name + ", country=" + country + "]";
	}

}
