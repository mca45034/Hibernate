package com.rays.auction;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLazyEager {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		AunctionItem a=(AunctionItem)session.get(AunctionItem.class, 11);
		Set set=a.getBids();
		Iterator i=set.iterator();
		
		tx.commit();
		session.close();
		
	}

}
