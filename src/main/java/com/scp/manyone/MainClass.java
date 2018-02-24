package com.scp.manyone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.mapping.Address;
import com.scp.mapping.Student;

public class MainClass {
	public static void main(String[] args) {

		Student1 s1 = new Student1("Megha", "desai");
		Student1 s2 = new Student1("neha", "desai");
		Address1 ad = new Address1("Pune", "MH");

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session s = sf.openSession();

		Transaction tr = s.beginTransaction();
		
		s1.setAddress(ad);
		s2.setAddress(ad);
		s.save(ad);
		s.persist(s1);
		s.persist(s2);
		tr.commit();
		s.close();
	}
}