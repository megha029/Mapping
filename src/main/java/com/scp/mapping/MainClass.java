package com.scp.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.onetomany.HibernateUtil;

public class MainClass {

	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	 
		 Student student = new  Student("Megha","Desai","Maths");
	        Address address = new Address( "street","Pune","chakan");
	         
	         
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	 
	        
	        session.save(address);
	        student.setAddress(address);
	        session.save(student);
	 
	      
	        /*List<Student> students = (List<Student>)session.createQuery("from Student ").list();
	        for(Student s: students){
	            System.out.println("Details : "+s);
	        }
	         */
	        session.getTransaction().commit();
	        session.close();  
	    }
	 
	}