package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HibernateUtil;

public class StudntCourseInsertExample {
	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setCost(1000);
		c1.setDuration("one-month");
		c1.setName("Java");

		Course c2 = new Course();
		c2.setCost(2000);
		c2.setDuration("Two-month");
		c2.setName("Aws");

		Course c3 = new Course();
		c3.setCost(3000);
		c3.setDuration("Three-month");
		c3.setName("Devops");

		List<Course> cl = new ArrayList<Course>();
		cl.add(c1);
		cl.add(c2);
		cl.add(c3);

		Student std = new Student();
		std.setId(1);
		std.setName("Harish");
		std.setLocation("Mysore");
		std.setCourse(cl);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(std);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");

	}
}
