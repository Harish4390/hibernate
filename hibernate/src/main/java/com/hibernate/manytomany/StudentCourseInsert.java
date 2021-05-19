package com.hibernate.manytomany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.HibernateUtil;

public class StudentCourseInsert {
	public static void main(String[] args) {

		Set<CourseEntity> courses = new HashSet<CourseEntity>();
		courses.add(new CourseEntity(1, "Corejava"));
		courses.add(new CourseEntity(2, "Advancejava"));

		StudentEntity student1 = new StudentEntity(100, "Harish", courses);
		StudentEntity student2 = new StudentEntity(101, "vijay", courses);

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(student1);
		s.save(student2);
		s.getTransaction().commit();
		s.close();
		sf.close();
		System.out.println("Done!!!!!!");

	}

}
