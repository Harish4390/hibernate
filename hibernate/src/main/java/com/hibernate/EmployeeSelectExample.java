package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeSelectExample {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Employee emp = (Employee) s.get(Employee.class, new Integer(100));
		System.out.println(emp.getAddress().getPermntaddress());
		s.close();
		sf.close();
	}

}
