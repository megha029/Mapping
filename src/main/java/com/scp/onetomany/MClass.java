package com.scp.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MClass {

	public static void main(String[] args) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = s.beginTransaction();

		Student2 s1 = new Student2(1, "megha");
		Student2 s2 = new Student2(2, "neha");
		Address2 ad = new Address2(101, "Pune", null);

		List<Student2> slist1 = new ArrayList<Student2>();

		
		slist1.add(s1);
		slist1.add(s2);
		ad.setStudents(slist1);

		

		s.save(ad);
		tr.commit();
		s.close();

	}
}
