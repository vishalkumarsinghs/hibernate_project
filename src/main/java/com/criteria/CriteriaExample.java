package com.criteria;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CriteriaExample {

	public static void main(String[] args) {
		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
	
	
	s.close();
	
	}
	
	
	
}
