package com.rays.auction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DirtyCheack {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		AunctionItem a = (AunctionItem) session.get(AunctionItem.class, 12);
		a.setDescription("Ram");
		tx.commit();
		session.close();
	}

}
