package in.co.rays.userdto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UserModel {
	public void add(UserDTO user ) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
	}
	public void update(UserDTO user) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(user);
		tx.commit();
		session.close();
		
		
	}
	public void delete(UserDTO user) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(user);
		tx.commit();
		session.close();
		
		
	}
	
	public UserDTO findByPk(int pk) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, pk);

		session.close();

		return dto;

		
	}
	
//	public List Search(UserDTO user) {
//		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session session=sf.openSession();
//		
//		
//		//return ;
//		
//	}
	public UserDTO authenticate(String login,String pass) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Query q = session.createQuery("from UserDTO where login = ? and pass = ?");
		q.setString(0, login);
		q.setString(1, pass);
		List list=q.list();
		UserDTO dto=null;
		if(list.size()>0) {
			dto=(UserDTO)list.get(0);
		}
		session.close();
		return dto;
		
	}
	public List search(UserDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(UserDTO.class);
		List list=criteria.list();
		session.close();
		return list;
		
	}

}
