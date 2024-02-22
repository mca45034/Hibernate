package com.rays.auction;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AuctionTest {
	public static void main(String[] args) {
		Bid bid1=new Bid();
		bid1.setId(4);
		bid1.setAmount(1000);
		bid1.setTimeStamp("A");
		
		Bid bid2=new Bid();
		bid2.setId(5);
		bid2.setAmount(2000);
		bid2.setTimeStamp("b");
		
		Bid bid3=new Bid();
		bid3.setId(6);
		bid3.setAmount(3000);
		bid3.setTimeStamp("c");
		
		Set bids=new HashSet();
		bids.add(bid1);
		bids.add(bid2);
		bids.add(bid3);
		
		
		AunctionItem a=new AunctionItem();
		a.setId(13);
		a.setDescription("auction 1");
		a.setBids(bids);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
		
	}

}
