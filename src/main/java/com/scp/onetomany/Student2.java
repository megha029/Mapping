package com.scp.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student2 {
	@Id
	@Column

	private int studentId;
	private String studentName;
	
	/*        OneTOMany Bidrectional               */

/*	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn*/

	/*@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
*/
	@ManyToOne(cascade = CascadeType.ALL)
	private Address2 address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student2 [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}

	public Student2(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		// this.address = address;
	}

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

}
