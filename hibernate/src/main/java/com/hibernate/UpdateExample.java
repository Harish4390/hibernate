package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setAge(20);
		std.setCls("sixth");
		std.setFname("harish");
		std.setName("vijay");
		std.setRollno(154);
		std.setStudid(222);

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.update(std);
		s.getTransaction().commit();
		s.close();
		System.out.println("update sucessful");
	}

}
