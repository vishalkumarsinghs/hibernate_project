package com.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Question {
	
	@Id
	@Column(name="question_Id")
	
	private int qustionId; 
	private String qustion;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Answer answer;
	
	@OneToMany(mappedBy="question")
	private List<Answer>answers=new ArrayList<Answer>();
	
	public int getQustionId() {
		return qustionId;
	}
	public void setQustionId(int qustionId) {
		this.qustionId = qustionId;
	}
	public String getQustion() {
		return qustion;
	}
	public void setQustion(String qustion) {
		this.qustion = qustion;
	}
	
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	public Question(int qustionId, String qustion, List<Answer> answers) {
		super();
		this.qustionId = qustionId;
		this.qustion = qustion;
		this.answers = answers;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
