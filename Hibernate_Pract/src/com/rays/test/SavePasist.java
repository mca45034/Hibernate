package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.userdto.UserDTO;

public class SavePasist {

	public static void main(String[] args) {
		UserDTO dto=new UserDTO();
		dto.setF_Name("rahul");
		dto.setL_Name("kirar");
		dto.setLogin("rahul@gmail.com");
		dto.setPass("rahul@123");
		dto.setDob(new Date());
		dto.setAddress("indore");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
       int i=(int)session.save(dto);
       System.out.println(i);
      // session.persist(dto);
       session.saveOrUpdate(dto);
	}

}
