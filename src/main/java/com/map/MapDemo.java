package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		Configuration cgf=new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
        
        //Creating Question
        
        Question q1=new Question();
        q1.setQustionId(1212);
        q1.setQustion("What is java ?");
        
        
        Answer answer=new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is programming language");
        answer.setQuestion(q1);
        
        Answer answer1=new Answer();
        answer1.setAnswerId(34);
        answer1.setAnswer("with the help of java we can create software");
        answer1.setQuestion(q1);
        
        Answer answer2=new Answer();
        answer2.setAnswerId(43);
        answer2.setAnswer("Java have deffrint of fremworks");
        answer2.setQuestion(q1);
        
        List<Answer>list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2); 
        q1.setAnswers(list);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
       s.save(q1);
       s.save(answer);
       s.save(answer1);
       s.save(answer2);
        
        tx.commit();
        //fetaching...
        
        Question newQ=(Question) s.get(Question.class, 1212);
        System.out.println(newQ.getQustion());
        System.out.println(newQ.getAnswers());
        
        s.close();
        
        factory.close();
	}

}
