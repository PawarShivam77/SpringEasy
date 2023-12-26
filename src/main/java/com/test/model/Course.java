package com.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "courses",schema = "fusion")
@Data
@Getter
@Setter
@ToString
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Course_Name")
	private String coursename;
	@Column(name = "Address")
	private String address;
	@Column(name = "Title")
	private String title;
	@Column(name = "Modules")
	private int modules;
	@Column(name = "Fees")
	private double fee;
	
	public Course() {
		
	}

	public Course(int id, String coursename, String address, String title, int modules, double fee) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.address = address;
		this.title = title;
		this.modules = modules;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", address=" + address + ", title=" + title
				+ ", modules=" + modules + ", fee=" + fee + "]";
	}
	
}
