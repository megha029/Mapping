package com.scp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="Employee13")
public class Employee {
	@Id
	int emplyId;
	String emplyName;
	
	/*many To many Unidirectional*/
	/*
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Employee_Comp")*/
	
	/*@ManyToMany(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	*/
	
	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Join_tableE", joinColumns = { @JoinColumn(name = "Emply_id") }, inverseJoinColumns = {
			@JoinColumn(name = "Comp_Id") })
	*/
	
	/*Many to many Bidirectional*/
	/*@ManyToMany(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn
	
	private List<Company> company = new ArrayList<Company>();



	public int getEmplyId() {
		return emplyId;
	}

	public void setEmplyId(int emplyId) {
		this.emplyId = emplyId;
	}

	public String getEmplyName() {
		return emplyName;
	}

	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}


	
	


	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public Employee(int emplyId, String emplyName) {
		super();
		this.emplyId = emplyId;
		this.emplyName = emplyName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [emplyId=" + emplyId + ", emplyName=" + emplyName + ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emplyId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (emplyId != other.emplyId)
			return false;
		return true;
	}

}