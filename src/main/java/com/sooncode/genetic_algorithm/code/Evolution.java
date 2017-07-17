package com.sooncode.genetic_algorithm.code;
/**
 * 进化
 * @author hechenwe@gmail.com
 *
 */
public interface Evolution {

	
	/**
	 * 
	 * @param chromosome
	 * @return 0.00 ~ 1.00  之间
	 */
	public int naturalSelect(Chromosome chromosome);
}
