package com.sooncode.genetic_algorithm.problem;

public class DayCalendar {

	
	private String DayName;
	
	private Integer firstLesson;
	private Integer secondLesson;
	private Integer thirdLesson;
	private Integer fourthLesson;
	public String getDayName() {
		return DayName;
	}
	public void setDayName(String dayName) {
		DayName = dayName;
	}
	public Integer getFirstLesson() {
		return firstLesson;
	}
	public void setFirstLesson(Integer firstLesson) {
		this.firstLesson = firstLesson;
	}
	public Integer getSecondLesson() {
		return secondLesson;
	}
	public void setSecondLesson(Integer secondLesson) {
		this.secondLesson = secondLesson;
	}
	public Integer getThirdLesson() {
		return thirdLesson;
	}
	public void setThirdLesson(Integer thirdLesson) {
		this.thirdLesson = thirdLesson;
	}
	public Integer getFourthLesson() {
		return fourthLesson;
	}
	public void setFourthLesson(Integer fourthLesson) {
		this.fourthLesson = fourthLesson;
	}
	public DayCalendar(String dayName, Integer firstLesson, Integer secondLesson, Integer thirdLesson, Integer fourthLesson) {
		super();
		DayName = dayName;
		this.firstLesson = firstLesson;
		this.secondLesson = secondLesson;
		this.thirdLesson = thirdLesson;
		this.fourthLesson = fourthLesson;
	}
 
	
	
}
