package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		
		
		 Configuration cgf=new Configuration();
	        cgf.configure("hibernate.cfg.xml");
	        SessionFactory factory=cgf.buildSessionFactory();
	        
	        student st1=new student(); 
	        st1.setId(4646);
	        st1.setName("Himanshu sir");
	        st1.setCity("Kanpur");
	        
	        
	        certificate cft=new certificate();
	        cft.setCourse("JAVA");
	        cft.setDuration("2month");
	        
	        student st2=new student();  
	        st2.setId(4646);
	        st2.setName("Harikesh sir");
	        st2.setCity("Rachi");
	        
	        
	        certificate cft1=new certificate();
	        cft1.setCourse("PAYTHN");
	        cft1.setDuration("6month");
	        //st2.setCerti(cft1);
	        
	        
	        Session s=factory.openSession();
	        Transaction tx=s.beginTransaction();
	        
	        // object save
	        s.save(st1);
	        s.save(st2);
	        
	        tx.commit();
	        s.close();
	        factory.close();
	}

}
