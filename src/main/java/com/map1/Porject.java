package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Porject {
	@Id
	private int pid;
	@Column(name="porject_name")
	private String porjectName;
	
	@ManyToMany(mappedBy="porjects")
	private List<Emp> emps;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPorjectName() {
		return porjectName;
	}

	public void setPorjectName(String porjectName) {
		this.porjectName = porjectName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Porject(int pid, String porjectName, List<Emp> emps) {
		super();
		this.pid = pid;
		this.porjectName = porjectName;
		this.emps = emps;
	}

	public Porject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
