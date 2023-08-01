package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		
		
	Configuration cgf=new Configuration();
	cgf.configure("hibernate.cfg.xml");
    SessionFactory factory=cgf.buildSessionFactory();
    
    Emp e1=new Emp();
    Emp e2=new Emp();
    
     e1.setEid(34);
     e1.setName("Rahul");
     
     e2.setEid(35);
     e2.setName("Vishal");
    
     Porject p1=new Porject();
     Porject p2=new Porject();
     
     p1.setPid(12122);
     p1.setPorjectName("Labrary managment system");
     
     p2.setPid(4646);
     p2.setPorjectName("Chatbot");
     
    List<Emp> list1=new ArrayList<Emp>();
    List<Porject> list2=new ArrayList<Porject>();
    
    list1.add(e1);
    list1.add(e2);
    
    list2.add(p1);
    list2.add(p2);
    
    e1.setPorjects(list2);
    p2.setEmps(list1);
    
    Session s=factory.openSession();
    Transaction tx=s.beginTransaction();
    
    s.save(e1);
    s.save(e2);
    s.save(p1);
    s.save(p2);
    
    tx.commit();
    
    s.close();
    
    factory.close();
    
    
    
    
    
	} 

}
