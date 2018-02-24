package com.scp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Company_12")
public class Company {
	@Id
	private int companyID;
	private String companyName;
 /*        Bidrectional       */
	@ManyToMany(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private List<Employee> empl = new ArrayList<Employee>();

	public int getCompanyID() {
		return companyID;

	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee> getEmpl() {
		return empl;
	}

	public void setEmpl(List<Employee> empl) {
		this.empl = empl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyID;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((empl == null) ? 0 : empl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Company))
			return false;
		Company other = (Company) obj;
		if (companyID != other.companyID)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (empl == null) {
			if (other.empl != null)
				return false;
		} else if (!empl.equals(other.empl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", companyName=" + companyName + ", empl=" + empl + "]";
	}

	public Company(int companyID, String companyName) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

}
