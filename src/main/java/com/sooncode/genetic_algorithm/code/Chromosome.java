package com.sooncode.genetic_algorithm.code;

import java.util.LinkedList;

/**
 * 染色体
 * @author hechenwe@gmail.com
 *
 */
public class Chromosome {

	private String chromosomeName;
	private Integer number;
	
	private LinkedList<DNAFragment> dna;

	public String getChromosomeName() {
		return chromosomeName;
	}

	public void setChromosomeName(String chromosomeName) {
		this.chromosomeName = chromosomeName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LinkedList<DNAFragment> getDna() {
		return dna;
	}

	public void setDna(LinkedList<DNAFragment> dna) {
		this.dna = dna;
	}

	
	public String getDNACode() {
		String code = new String ();
		for (DNAFragment dnaFragment : dna) {
			code += dnaFragment.getFragmentCode();
		}
		return code;
	}
	
	public void setDNACode(String dnaCode) {
		int totalLength = 0;
		for (DNAFragment dnaFragment : dna) {
			 String code = dnaCode.substring(totalLength,totalLength+dnaFragment.getCodeLength());
			 dnaFragment.setFragmentCode(code);
			 totalLength += dnaFragment.getCodeLength();
		}
	}
	
	
	@Override
	public String toString() {
		return "Chromosome [chromosomeName=" + chromosomeName + ", number=" + number + ", dna=" + dna + "]";
	}
	
}
