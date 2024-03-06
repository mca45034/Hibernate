package com.rays.inheritencetableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TsestPyment {

	public static void main(String[] args) {
		Payment py=new Payment();
		py.setId(1);
		py.setAmount(10000);
		py.setPaymentType("upi");
		
		Cheque ch=new Cheque();
		ch.setId(2);
		ch.setAmount(20000);
		ch.setPaymentType("case");
		ch.setChqNumber(45342);
		ch.setBankName("boi");
		
		CreditCardPyment cc=new CreditCardPyment();
		cc.setId(3);
		cc.setAmount(40000);
		cc.setPaymentType("netbanking");
		cc.setCcType("VISA");
		Cash c=new Cash();
		c.setId(4);
		c.setAmount(10000);
		c.setPaymentType("upi");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(py);
		session.save(ch);
		session.save(cc);
		session.save(c);
		tx.commit();
		session.close();

	}

}
