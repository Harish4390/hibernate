package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeInsertExample {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpid(100);
		emp.setLocation("banglore");
		emp.setName("harish");

		Address adrs = new Address();
		adrs.setId(1);
		adrs.setPermntaddress("hyd");
		adrs.setTempaddress("banglore");

		emp.setAddress(adrs);

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(emp);
		s.getTransaction().commit();
		s.close();
		System.out.println("emp insert successful!!!");

	}
}
