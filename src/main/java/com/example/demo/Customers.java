package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String coursename;
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", coursename=" + coursename + "]";
	}
		
		
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCourse() {
		return coursename;
	}
	public void setCourse(String cemail) {
		this.coursename = coursename;
	}
		
}
