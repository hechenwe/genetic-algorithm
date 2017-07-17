package com.sooncode.genetic_algorithm.problem;

public class Course {

	private String courseCode;
	private String courseName;
	
	private Teacher teacher;
	
	private ClassRoom classRoom;
	
	private Integer teachingTime;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

	public Integer getTeachingTime() {
		return teachingTime;
	}

	public void setTeachingTime(Integer teachingTime) {
		this.teachingTime = teachingTime;
	}

	public Course(String courseCode, String courseName, Teacher teacher, ClassRoom classRoom, Integer teachingTime) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.teacher = teacher;
		this.classRoom = classRoom;
		this.teachingTime = teachingTime;
	}
	
	
}
