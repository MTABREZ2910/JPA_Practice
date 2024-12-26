package com.jpa.Practice.JPA_Practice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="standard")
	private int standard;
	
	@Column(name="teacher_name")
	private String teacherName;
	
	@Column(name="mob_number")
	private long mobileNumber;
	
	

	@Override
	public String toString() {
		return "School [standard=" + standard + ", teacherName=" + teacherName + ", mobileNumber=" + mobileNumber + "]";
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
