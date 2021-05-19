package com.hibernate.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.HibernateUtil;

public class EmployeePhoneSelect {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Emp emp = (Emp)session.get(Emp.class, new Integer(1));
		System.out.println(emp.getDesignation());
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
