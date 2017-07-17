package com.sooncode.genetic_algorithm.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 自然进化
 * 
 * @author hechenwe@gmail.com
 *
 */
public class NaturalEvolution {

	private  int minAcclimatize ;
	private  int acclimatizeChromosomeSize ;
	private  double dnaExchangeRate  ;
	private  double dnaMutationRate  ;

	/**
	 * 自然选择
	 * 
	 * @param chromosomes
	 * @param evolution
	 * @return
	 */
	public  List<Chromosome> naturalSelect(List<Chromosome> chromosomes, Evolution evolution) {
	 
		
		List<Chromosome> list = new ArrayList<>(chromosomes);
	 
		
		 while ( list.size() > acclimatizeChromosomeSize || list.size() == 0 ) {
			 List<Chromosome> ches2 = exchange(chromosomes);
			 List<Chromosome> ches3 = mutation(ches2);
			 List<Chromosome> ches =  eliminate(ches3, evolution);
			 list = new ArrayList<>(ches);
		}
		 
		 return list;
		
	}

	/**
	 * 基因淘汰
	 * 
	 * @param chromosomes
	 * @return
	 */
	private  List<Chromosome> eliminate(List<Chromosome> chromosomes, Evolution evolution) {

		 
		List<Chromosome> list = new LinkedList<Chromosome>();
		Map<Chromosome, Integer> acclimatizes = new HashMap<>();
		for (int i = 0; i < chromosomes.size(); i++) {
			Chromosome ch = chromosomes.get(i);
			int acclimatize = evolution.naturalSelect(ch);
			if (acclimatize >= minAcclimatize) {
				list.add(ch);
				acclimatizes.put(ch, acclimatize);
			}
		}

		List<Entry<Chromosome, Integer>> sortList = new ArrayList<Entry<Chromosome, Integer>>(acclimatizes.entrySet());

		Collections.sort(sortList, new Comparator<Map.Entry<Chromosome, Integer>>() {
			public int compare(Map.Entry<Chromosome, Integer> o1, Map.Entry<Chromosome, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});
		
		int size = (int) (  sortList.size()*0.2);
		for(int i = 0 ;i<size ; i++) {
			Entry<Chromosome, Integer> en = sortList.get(i);
			list.remove(en.getKey());
		}
		 
		
		return list;
	}

	/**
	 * 基因交换
	 * 
	 * @param chromosomes
	 * @return
	 */
	private  List<Chromosome> exchange(List<Chromosome> chromosomes) {

		List<Chromosome> list = new LinkedList<>();
		for (int i = 0; i < chromosomes.size() / 2; i++) {
			Chromosome c1 = new Chromosome();
			Chromosome c2 = new Chromosome();
			c1.setChromosomeName(chromosomes.get(i).getChromosomeName());
			c1.setNumber(chromosomes.get(i).getNumber());
			c1.setDna(chromosomes.get(i).getDna());
			c2.setChromosomeName(chromosomes.get(i + 1).getChromosomeName());
			c2.setNumber(chromosomes.get(i + 1).getNumber());
			c2.setDna(chromosomes.get(i + 1).getDna());
			String firstDNAcode = new String(chromosomes.get(i).getDNACode());
			String secondDNAcode = new String(chromosomes.get(i + 1).getDNACode());
			if (Math.random() < dnaExchangeRate) {
				DNAexchange dnaExchange = new DNAexchange();
				dnaExchange.setFirstDNAcode(firstDNAcode);
				dnaExchange.setSecondDNAcode(secondDNAcode);
				String firstCode = dnaExchange.exchangeCode().get(0);
				String secendCode = dnaExchange.exchangeCode().get(1);
				c1.setDNACode(firstCode);
				c2.setDNACode(secendCode);

			}

			list.add(c1);
			list.add(c2);
		}

		return list;
	}

	/**
	 * 基因突变
	 * 
	 * @param chromosomes
	 * @return
	 */
	private  List<Chromosome> mutation(List<Chromosome> chromosomes) {

		for (Chromosome chromosome : chromosomes) {
			if (Math.random() < dnaMutationRate) {
				String mutationCode = DNAmutation.amutation(chromosome.getDNACode());
				chromosome.setDNACode(mutationCode);
			}
		}

		return chromosomes;
	}
    /**
     * 
     * @param minAcclimatize 最小的适应值
     * @param acclimatizeChromosomeSize 筛选出最优的染色体数量
     * @param dnaExchangeRate 基因交换概率 
     * @param dnaMutationRate 基因突变概率
     */
	public NaturalEvolution(int minAcclimatize, int acclimatizeChromosomeSize, double dnaExchangeRate, double dnaMutationRate) {
		super();
		this.minAcclimatize = minAcclimatize;
		this.acclimatizeChromosomeSize = acclimatizeChromosomeSize;
		this.dnaExchangeRate = dnaExchangeRate;
		this.dnaMutationRate = dnaMutationRate;
	}
	
	
	

}
