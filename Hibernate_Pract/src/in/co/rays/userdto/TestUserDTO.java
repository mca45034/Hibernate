package in.co.rays.userdto;

import java.util.Date;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestUserDTO {

	public static void main(String[] args) {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testFindByPk();
		//testList();
		//testAuthenticate();
		testSearch();
		
	

	}

	private static void testSearch() {
		UserDTO dto=new UserDTO();
		UserModel model=new UserModel();
		List list=model.search(dto);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			dto=(UserDTO)it.next();
			System.out.print(dto.getId());
			System.out.print("\t"+dto.getF_Name());
			System.out.print("\t"+dto.getL_Name());
			System.out.print("\t"+dto.getLogin());
			System.out.print("\t"+dto.getPass());
			System.out.print("\t"+dto.getDob());
			System.out.println("\t"+dto.getAddress());
		}
		
	}

	private static void testAuthenticate() {
		UserModel model=new UserModel();
		UserDTO dto=model.authenticate("rk@gmail.com", "1234");
		if(dto !=null) {
			System.out.println(dto.getId());
			System.out.println(dto.getF_Name());
			System.out.println(dto.getL_Name());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPass());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}
		else {
			System.out.println("invalide authenticate.....!!!");
		}
		
		
	}

	private static void testList() {
		// TODO Auto-generated method stub
		
	}

	private static void testFindByPk() {
		UserModel model=new UserModel();
		UserDTO dto=model.findByPk(3);
		System.out.println(dto.getId());
		System.out.println(dto.getF_Name());
		System.out.println(dto.getL_Name());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPass());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
		
		
	}

	private static void testDelete() {
		UserDTO user=new UserDTO();
		UserModel model=new UserModel();
		user.setId(1);
		model.delete(user);
		
		
	}

	private static void testUpdate() {
		UserModel model=new UserModel();
		UserDTO user=new UserDTO();
		user.setId(1);
		user.setF_Name("abdddc");
		user.setL_Name("xyz");
		user.setLogin("rahul@gmail.com");
		user.setPass("ttttt");
		user.setDob(new Date());
		user.setAddress("indore");
		model.update(user);
		
		
		
	}

	private static void testAdd() {
		UserModel model=new UserModel();
		UserDTO user=new UserDTO();
		
		user.setF_Name("sita");
		user.setL_Name("sharma");
		user.setLogin("sitaa@gmail.com");
		user.setPass("1234");
		user.setDob(new Date());
		user.setAddress("delhi");
		model.add(user);
		
		
	}
	

}
