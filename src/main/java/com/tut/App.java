package com.tut;

import java.util.Date;
import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
  // private static final String True = null;
//private static SessionFactory session;

public static void main(String[] args) {
		
	
	

    
        System.out.println( "Porject Started..." );
        
        Configuration cgf=new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
        
        student st=new student();
        st.setId(102);
        st.setName("Rahul sir");
        st.setCity("Noida");
        
        System.out.println(st);
        
        
        //creating object of address class
        
        Address ad=new Address();
        ad.setStreet("Street1");
        ad.setCity("DELHI");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setImage(null);
        
        Session session= factory.openSession();
        
        Transaction tx= session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        
        System.out.println("Done....");
        
       // session.getTransaction().commit();
        
        
    }

}
