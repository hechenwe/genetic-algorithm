package com.sooncode.genetic_algorithm.problem;

public class Teacher {

	private String teacherName;
	
	private String teacherCode;

	private Subject subject;
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher(String teacherName, String teacherCode, Subject subject) {
		super();
		this.teacherName = teacherName;
		this.teacherCode = teacherCode;
		this.subject = subject;
	}
	
	
}
