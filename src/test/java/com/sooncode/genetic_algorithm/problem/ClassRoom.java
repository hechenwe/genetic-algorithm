package com.sooncode.genetic_algorithm.problem;

public class ClassRoom {

	private String classRoomCode;
	private String classRoomName;
	private Integer volume;
	
	private DayCalendar dayCalendar;
	public String getClassRoomCode() {
		return classRoomCode;
	}
	public void setClassRoomCode(String classRoomCode) {
		this.classRoomCode = classRoomCode;
	}
	public String getClassRoomName() {
		return classRoomName;
	}
	public void setClassRoomName(String classRoomName) {
		this.classRoomName = classRoomName;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public DayCalendar getDayCalendar() {
		return dayCalendar;
	}
	public void setDayCalendar(DayCalendar dayCalendar) {
		this.dayCalendar = dayCalendar;
	}
	public ClassRoom(String classRoomCode, String classRoomName, Integer volume, DayCalendar dayCalendar) {
		super();
		this.classRoomCode = classRoomCode;
		this.classRoomName = classRoomName;
		this.volume = volume;
		this.dayCalendar = dayCalendar;
	}
	
	
	
	
}
