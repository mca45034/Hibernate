package com.rays.auction;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTransitivePersistance {
	public static void main(String[] args) {
		Bid bid = new Bid();
		bid.setId(5);
		bid.setAmount(4000);
		bid.setTimeStamp("TTTT");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		AunctionItem item = (AunctionItem) session.get(AunctionItem.class, 11);

		Set s = item.getBids();

		s.add(bid);

		tx.commit();

		session.close();

	}

}
