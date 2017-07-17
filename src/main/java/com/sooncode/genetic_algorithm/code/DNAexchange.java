package com.sooncode.genetic_algorithm.code;

import java.util.LinkedList;
import java.util.List;
/**
 * 基因交换
 * @author hechenwe@gmail.com
 *
 */
public class DNAexchange {

	private String firstDNAcode;
	private String secondDNAcode;

	public List<String> exchangeCode() {

		int length = firstDNAcode.length();
		List<Integer> lengths = this.randomSubject(length);
		String firstCode = new String();
		String secondCode = new String();
		int totalLenth = 0;

		List<String> dnaCodes = new LinkedList<>();
		for (Integer len : lengths) {
			double random = Math.random();
			if (random > 0.5) {
				firstCode = firstDNAcode.substring(totalLenth, totalLenth+len);
				secondCode = secondDNAcode.substring(totalLenth, totalLenth+len);
				String firstHeadCode = firstDNAcode.substring(0, totalLenth);
				String firstFootCode = firstDNAcode.substring(totalLenth + len , length);
				String secondHeadCode = secondDNAcode.substring(0, totalLenth);
				String secondFootCode = secondDNAcode.substring(totalLenth + len , length);
				firstDNAcode = new String(firstHeadCode + secondCode + firstFootCode);
				secondDNAcode =   new String(secondHeadCode + firstCode + secondFootCode);
			}

			totalLenth += len;
		}

		dnaCodes.add(firstDNAcode);
		dnaCodes.add(secondDNAcode);

		return dnaCodes;
	}

	private List<Integer> randomSubject(int length) {
		List<Integer> list = new LinkedList<>();
		int sum = 0;
		while (sum != length) {
			int romd = (int) (Math.random() * 10);
			if (romd < length/3 && romd != 0) {
				sum += romd;
				list.add(romd);
			}
			if (sum > length) {
				sum = 0;
				list.clear();
			}
		}
		 
		return list;
	}

	
	
	
	
	
	public void setFirstDNAcode(String firstDNAcode) {
		this.firstDNAcode = firstDNAcode;
	}

	public void setSecondDNAcode(String secondDNAcode) {
		this.secondDNAcode = secondDNAcode;
	}

	 

}
