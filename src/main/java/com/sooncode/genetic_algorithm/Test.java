package com.sooncode.genetic_algorithm;

import java.util.List;
 

import com.sooncode.genetic_algorithm.code.Chromosome;
import com.sooncode.genetic_algorithm.code.Evolution;
import com.sooncode.genetic_algorithm.code.GenePool;
import com.sooncode.genetic_algorithm.code.NaturalEvolution;

/**
 * Hello world!
 *
 */
public class Test 
{
  
    public static void main( String[] args )
    {
    	List<Chromosome> list = GenePool.getChromosomes(20, new int[] {10});
    	NaturalEvolution ne = new NaturalEvolution(80, 5, 0.4, 0.6);
    	List<Chromosome> list2 =  ne.naturalSelect(list, new Evolution() {
			
			@Override
			public int naturalSelect(Chromosome chromosome) {
				String code = chromosome.getDNACode();
				int r = 0;
				if(code.indexOf("10101")==0) {
					 r = RandomBuilder.random(90, 100);
				}else {
					r = 61;
				}
				return r;
			}
		});
    	for (Chromosome chromosome : list2) {
    		System.out.println(chromosome);
		}
    	 
    }
   
}
