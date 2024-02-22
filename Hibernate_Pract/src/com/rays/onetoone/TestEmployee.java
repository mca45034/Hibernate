package com.rays.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
	public static void main(String[] args) {
		Address a=new Address();
		a.setId(1);
		a.setStreet("vjNager");
		a.setCity("bhopal");
		Employee e=new Employee();
		e.setId(11);
		e.setName("sham");
		e.setEmpAddress(a);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		
		
		
	}

}
