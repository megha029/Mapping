package com.scp.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		Company comp = new Company(101, "TCS");
		Employee e1 = new Employee(1, "Megha");
		Employee e2 = new Employee(2, "neha");
		Employee e3 = new Employee(3, "sur");

		e1.getCompany().add(comp);
		e2.getCompany().add(comp);
		e3.getCompany().add(comp);

		comp.getEmpl().add(e1);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		trans.commit();
		session.close();
	}
}
