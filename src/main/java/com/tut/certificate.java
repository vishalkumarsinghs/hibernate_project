package com.tut;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class certificate {
	
	@Id
	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	

}
