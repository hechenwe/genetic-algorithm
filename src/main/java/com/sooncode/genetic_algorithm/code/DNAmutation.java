package com.sooncode.genetic_algorithm.code;

import java.util.LinkedList;
import java.util.List;

/**
 * 基因突变
 * 
 * @author hechenwe@gmail.com
 *
 */
public class DNAmutation {

	private static List<Integer> randomAmutationSpot(int length) {
		List<Integer> list = new LinkedList<>();
		int sum = 0;
		while (sum < length) {
			int romd =     (int) (Math.random() * length );
			if (romd < length && romd != 0) {
				sum += romd;
				if (sum < length) {
					list.add(sum);
				}
			}

		}

		return list;
	}

	public  static String amutation(String dnaCode) {
		List<Integer> list = randomAmutationSpot(dnaCode.length());

		for (Integer spot : list) {
			String ch = dnaCode.substring(spot - 1, spot);
			String amutationCh = ch.equals("0") ? "1" : "0";
			dnaCode = dnaCode.substring(0, spot - 1) + amutationCh + dnaCode.substring(spot, dnaCode.length());
		}

		return dnaCode;
	}

	 

}
