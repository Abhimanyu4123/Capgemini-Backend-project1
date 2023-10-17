package com.cg.sm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	
	private int id;
	private String name;
	private String college;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private String certificate;
	private int hallTicketNo;
	
	
	public Student() {
		super();
	}


	public Student(int id, String name, String college, int roll, String qualification, String course, int year,
			String certificate, int hallTicketNo) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallTicketNo = hallTicketNo;
	}

    @Id
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


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCertificate() {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}


	public int getHallTicketNo() {
		return hallTicketNo;
	}


	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallTicketNo=" + hallTicketNo + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getCollege()=" + getCollege() + ", getRoll()=" + getRoll() + ", getQualification()="
				+ getQualification() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCertificate()=" + getCertificate() + ", getHallTicketNo()=" + getHallTicketNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
