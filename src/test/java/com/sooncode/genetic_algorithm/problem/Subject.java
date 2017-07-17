package com.sooncode.genetic_algorithm.problem;

public class Subject {

	private String subjectName;
	
	private String subjectType;

	
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public Subject(String subjectName, String subjectType) {
		super();
		this.subjectName = subjectName;
		this.subjectType = subjectType;
	}
	
	
}
