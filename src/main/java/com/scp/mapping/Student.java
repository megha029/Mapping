package com.scp.mapping;	


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name = "STUDENT13")
public class Student {
 
    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private long id;
 
    @Column(name = "FIRST_NAME")
    private String firstName;
 
    @Column(name = "LAST_NAME")
    private String lastName;
 
    @Column(name = "SECTION")
    private String section;
 
    
   /*                unidirectional one to one              */
    
/*    @JoinColumn(name = "Home_ADDRESS_ID")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
 */
 
   /* @OneToOne
    @JoinTable(name="join_table",joinColumns=@JoinColumn(name="stud_id"),inverseJoinColumns=@JoinColumn(name="ad_id"))
    private Address address;
    public Student() {
 
    }
 */
   /* @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;*/
    
    /*                bidrectional  One TO One                */
    
    
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NewId")*/
   
   /* @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    */
    
    
    @OneToOne(mappedBy="students",cascade=CascadeType.ALL)
    @JoinTable(name="join_table1",joinColumns=@JoinColumn(name="stud1_id"),inverseJoinColumns=@JoinColumn(name="ad1_id"))
    private Address address;
    
    public Student(String firstName, String lastName, String section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getSection() {
        return section;
    }
 
    public void setSection(String section) {
        this.section = section;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", section=" + section + ", address=" + address
                + "]";
    }
 
}