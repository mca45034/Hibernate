package com.rays.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import in.co.rays.userdto.UserDTO;

public class TestCriteriaAnd {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.like("F_NAME", "r%"));
		criteria.add(Restrictions.like("L_NAME", "s%"));
		List list=criteria.list();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			UserDTO user=new UserDTO();
			System.out.print(user.getId());
			System.out.print(("/t"+user.getF_Name()));
			System.out.print("/t"+user.getL_Name());
			System.out.print("/t"+user.getLogin());
			System.out.print("/t"+user.getPass());
			System.out.print("/t"+user.getDob());
			System.out.println("/t"+user.getAddress());
		}
		tx.commit();
		session.close();
		

	}

}
