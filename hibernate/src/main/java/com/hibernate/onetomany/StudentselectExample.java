package com.hibernate.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HibernateUtil;

public class StudentselectExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student std = (Student)session.get(Student.class, new Integer(1));
		System.out.println(std.getName());
		System.out.println("Done");
	} 

}
