package com.sooncode.genetic_algorithm;

import java.util.LinkedList;
import java.util.List;

import com.sooncode.genetic_algorithm.code.Chromosome;
import com.sooncode.genetic_algorithm.code.DNAFragment;
import com.sooncode.genetic_algorithm.code.Evolution;
import com.sooncode.genetic_algorithm.code.GenePool;
import com.sooncode.genetic_algorithm.code.NaturalEvolution;

/**
 * Hello world!
 *
 */
public class MathTest {

	public static void main(String[] args) {
		List<Chromosome> list = GenePool.getChromosomes(20, new int[] { 26, 26 });
		for (Chromosome chromosome : list) {
			System.out.println(chromosome.getDNACode());

		}
		NaturalEvolution ne = new NaturalEvolution(80, 1, 0.4, 0.6);
		List<Chromosome> list2 = ne.naturalSelect(list, new Evolution() {

			@Override
			public int naturalSelect(Chromosome chromosome) {
				LinkedList<DNAFragment> list = chromosome.getDna();

				int a = Integer.parseInt(list.get(0).getFragmentCode(), 2);
				int b = Integer.parseInt(list.get(1).getFragmentCode(), 2);

				double x = a * (6.0 - 0) / (Math.pow(2, 23) - 1); // x的基因
				double y = b * (6.0 - 0) / (Math.pow(2, 23) - 1); // y的基因

				// 需优化的函数
				double fitness = 3 - Math.sin(2 * x) * Math.sin(2 * x) - Math.sin(2 * y) * Math.sin(2 * y);
				//System.out.println(chromosome.getDNACode() + " : " + fitness);
				if(fitness>=1.001 && fitness < 1.009 ) {
					return 90;
				}else {
					return 61;
				}
				
			}
		});
		for (Chromosome chromosome : list2) {
			LinkedList<DNAFragment> l = chromosome.getDna();

			int a = Integer.parseInt(l.get(0).getFragmentCode(), 2);
			int b = Integer.parseInt(l.get(1).getFragmentCode(), 2);

			double x = a * (6.0 - 0) / (Math.pow(2, 23) - 1); // x的基因
			double y = b * (6.0 - 0) / (Math.pow(2, 23) - 1); // y的基因

			// 需优化的函数
			double fitness = 3 - Math.sin(2 * x) * Math.sin(2 * x) - Math.sin(2 * y) * Math.sin(2 * y);
			System.out.println(chromosome.getDNACode() + " : " + fitness);
		}

	}

}
