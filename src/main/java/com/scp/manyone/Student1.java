package com.scp.manyone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_3")
public class Student1 {
@Id
@GeneratedValue
@Column(name="Student_Id")
private long id;

@Column(name="First_Name")
private String FirstName;

@Column(name="Last_Name")
private String LastName;


  /*                OneToMany Unidirectional             */


/*@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "Address_ID")
private Address1 Address;*/


/*@ManyToOne(cascade=CascadeType.ALL)
@PrimaryKeyJoinColumn(name = "Address_ID")
private Address1 Address;*/

@ManyToOne(cascade = CascadeType.ALL)
@JoinTable(name="join_table3",joinColumns=@JoinColumn(name="Stud_id"),inverseJoinColumns=@JoinColumn(name=""))
private Address1 Address;


public Student1() {
	super();
	// TODO Auto-generated constructor stub
}

public Student1(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}


public Address1 getAddress() {
	return Address;
}

public void setAddress(Address1 address) {
	Address = address;
}



@Override
public String toString() {
	return "Student1 [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
}





}
