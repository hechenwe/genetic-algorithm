package com.sooncode.genetic_algorithm;

import com.sooncode.genetic_algorithm.problem.ClassRoom;
import com.sooncode.genetic_algorithm.problem.Course;
import com.sooncode.genetic_algorithm.problem.DayCalendar;
import com.sooncode.genetic_algorithm.problem.SchoolSubject;
import com.sooncode.genetic_algorithm.problem.Teacher;

/**
 * Unit test for simple App.
 */
public class ArrangeCourse{
  
	
	public static void main(String[] args) {
		
		Teacher zhang = new Teacher("张老师", "0001", SchoolSubject.CHINESE);
		Teacher li = new Teacher("李老师", "0002", SchoolSubject.MATH);
		Teacher wang = new Teacher("王老师", "0003", SchoolSubject.ENGLISH);
		Teacher he = new Teacher("何老师", "0004", SchoolSubject.MATH);
		
		
		ClassRoom cr101 = new ClassRoom("101", "普通101", 5, new DayCalendar("1月1号", 0, 0, 0, 0));
		ClassRoom cr102 = new ClassRoom("102", "普通102", 5, new DayCalendar("1月1号", 0, 0, 0, 0));
		ClassRoom cr103 = new ClassRoom("103", "普通103", 5, new DayCalendar("1月1号", 0, 0, 0, 0));
		ClassRoom cr104 = new ClassRoom("104", "普通104", 5, new DayCalendar("1月1号", 0, 0, 0, 0));
		
		
		Course c1 = new Course("chinese", "语文", null, null, null);
		Course c2 = new Course("math", "数学", null, null, null);
		Course c3 = new Course("english", "英语", null, null, null);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
