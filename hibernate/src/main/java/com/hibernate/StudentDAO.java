package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDAO {

	public static void main(String[] args) {

		Student std = new Student();
		std.setAge(20);
		std.setCls("sixth");
		std.setFname("harish");
		std.setName("harikrishna");
		std.setRollno(154);
		std.setStudid(111);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(std);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");

	}
}
