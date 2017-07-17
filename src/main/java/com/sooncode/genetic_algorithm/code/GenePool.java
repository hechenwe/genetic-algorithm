package com.sooncode.genetic_algorithm.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 

public class GenePool {

	
	private static Chromosome  buildChromosome(int [] dnaFragmentLengths) {
		
		Chromosome c = new Chromosome();
		c.setChromosomeName(UuidBuilder.createUUID());
		LinkedList<DNAFragment> dNAFragments = new LinkedList<DNAFragment>();
		for (int length : dnaFragmentLengths) {
			DNAFragment dnaF = new DNAFragment();
			dnaF.setCodeLength(length);
			dnaF.setFragmentName(UuidBuilder.createUUID());
			String code = randomBuildDnaFragmentCode(length);
			dnaF.setFragmentCode(code);
			dNAFragments.add(dnaF);
		}
		c.setDna(dNAFragments);
		return c;
	}
	
	private static String randomBuildDnaFragmentCode(int length) {
		String code = new String ();
		for (int i = 0; i < length; i++) {
			int n = Math.random()>0.5 ? 1 : 0;
			code += "" + n;
		}
		return code;
	}
	
	
	public static List<Chromosome> getChromosomes (int size, int [] dnaFragmentLengths){
		List<Chromosome> chromosomes = new ArrayList<Chromosome>();
		for (int i = 0 ; i< size; i++) {
			Chromosome  c = buildChromosome(dnaFragmentLengths);
			chromosomes.add(c);
		}
		return chromosomes;
	}
	
	public static void main(String[] args) {
		 List<Chromosome> list = GenePool.getChromosomes(10, new int [] {43,64,8});
		 System.out.println(list);
		
	}
}
