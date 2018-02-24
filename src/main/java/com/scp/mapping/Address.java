package com.scp.mapping;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 

@Entity
@Table(name = "ADDRESS_2")
public class Address {
 
    @Id 
    @GeneratedValue
  @Column(name = "ADDRESS_ID")
    private long id;
 
    @Column(name = "STREET")
    private String street;
 
    @Column(name = "CITY")
    private String city;
 
    @Column(name = "COUNTRY")
    private String country;
    
  /*                      bidrectional  One TO One                       */
    
  /*@OneToOne
  @JoinColumn
  private Student students;*/
  

   /* @OneToOne
    @PrimaryKeyJoinColumn
    private Student students;*/
    
    
    @OneToOne
    @JoinColumn
    private Student students;
    
	public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    @Override
    public String toString() {
        return "Address [ street=" + street + ", city=" + city
                + ", country=" + country + "]";
    }
    public Address() {
    	 
    }
 
   
 
    public Address( String street, String city, String country) {
		super();
		//this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	
}