package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HibernateUtil;

public class EmployeePhoneInsert {
	public static void main(String[] args) {

		phone p1 = new phone();
		p1.setId(1);
		p1.setNumber("123456");
		p1.setType("Dual sim");

		phone p2 = new phone();
		p2.setId(2);
		p2.setNumber("1234567");
		p2.setType("single sim");

		List<phone> phones = new ArrayList<phone>();
		phones.add(p1);
		phones.add(p2);

		Emp e = new Emp();
		e.setId(1);
		e.setFname("harish");
		e.setLname("G");
		e.setDesignation("unemployed");
		e.setPhone(phones);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(e);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
