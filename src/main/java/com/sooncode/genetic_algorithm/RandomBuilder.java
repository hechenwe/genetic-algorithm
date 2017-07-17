package com.sooncode.genetic_algorithm;

import java.util.Random;

public class RandomBuilder {
	 public static int random( int min, int max) {
			Random random = new Random();

	        int s = random.nextInt(max)%(max-min+1) + min;
	        return s;
		 }
	 
	 public static void main(String[] args) {
		System.out.println(random(80,100));
	}
	 
}
