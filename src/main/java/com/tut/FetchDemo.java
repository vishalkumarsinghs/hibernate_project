package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	// get , load
	
	Configuration cgf=new Configuration();
    cgf.configure("hibernate.cfg.xml");
    SessionFactory factory=cgf.buildSessionFactory();
    Session session=factory.openSession();
 //   get student:102
	 student st=session.get(student.class, 102);
	// student st=session.get(student.class, 102);
	 
	 
	 
	
	System.out.println(st);
    
    session.close();
    factory.close();
}
}
