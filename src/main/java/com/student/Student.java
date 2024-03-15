package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int id;
	private String name;
	private long contact;
	private double percent;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", percent=" + percent + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	public Student() {
		//super();
	}
	public Student(int id, String name, long contact, double percent) {
		//super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.percent = percent;
	}
	
	
	
	
}
