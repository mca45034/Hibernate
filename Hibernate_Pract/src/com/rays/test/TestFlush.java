package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.userdto.UserDTO;

public class TestFlush {
	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		// dto.setId(4);
		dto.setF_Name("abhinandan");
		dto.setL_Name("singh");
		dto.setLogin("abhinandan@gmail.com");
		dto.setPass("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		session.flush();

		System.out.println("id = " + dto.getId());

		dto = (UserDTO) session.get(UserDTO.class, 2);

		System.out.println("first name = " + dto.getF_Name());

		tx.commit();

		session.close();

	}


}
