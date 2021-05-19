package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentSelectEx {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		Student std = (Student) s.get(Student.class, 111);
		s.getTransaction().commit();
		
		Session s2 = sf.openSession();
		s.beginTransaction();
		Student std2 = (Student) s2.get(Student.class, 111);
		s.getTransaction().commit();
		
		sf.close();
		
		System.out.println("done!!!!!!!!!!!!!!");
	}

}
