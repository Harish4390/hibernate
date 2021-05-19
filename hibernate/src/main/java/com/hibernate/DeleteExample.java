package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setStudid(111);
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.delete(std);
		s.getTransaction().commit();
		s.close();
		System.out.println("deleted successsfully!!!!!!!!!!");
	}

}
