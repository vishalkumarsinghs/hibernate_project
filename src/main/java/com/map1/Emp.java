package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	private List<Porject> porjects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Porject> getPorjects() {
		return porjects;
	}

	public void setPorjects(List<Porject> porjects) {
		this.porjects = porjects;
	}

	public Emp(int eid, String name, List<Porject> porjects) {
		super();
		this.eid = eid;
		this.name = name;
		this.porjects = porjects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
