package com.scp.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name = "Address_Info2")
	public class Address2 {
		@Id
		@GeneratedValue
		@Column
		
		private int id;
		private String city;
		
		/*                  One TO Many bidirectional                    */
		
		/*@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn*/
		
		/*@OneToMany(cascade = CascadeType.ALL)
		@PrimaryKeyJoinColumn*/
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinTable(name="join_table2",joinColumns=@JoinColumn(name="Add_id"),inverseJoinColumns=@JoinColumn(name="Stu_id"))
		private List<Student2> students;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public List<Student2> getStudents() {
			return students;
		}
		public void setStudents(List<Student2> students) {
			this.students = students;
		}
		public Address2() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Address2))
				return false;
			Address2 other = (Address2) obj;
			if (id != other.id)
				return false;
			return true;
		}
		public Address2(int id, String city, List<Student2> students) {
			super();
			this.id=id;
			this.city = city;
			this.students = students;
		}
		@Override
		public String toString() {
			return "Address2 [id=" + id + ", city=" + city + ", students=" + students + "]";
		}
		
}
