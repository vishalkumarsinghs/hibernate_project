package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.internal.ast.tree.Statement;

import com.tut.student;

public class HQLExample {
	public static void main(String[] args) {
		
		Configuration cgf=new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
        
        Session s=factory.openSession();
        
        String query="from student";
        
        Query q=s.createQuery(query);
        
        List<student>list=q.list(); 
        for(student students:list) {
        	System.out.println(students.getName());
        }
        
        
        s.close();
        factory.close();
	}

}
