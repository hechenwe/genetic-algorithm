package com.sooncode.genetic_algorithm.code;
/**
 * DNA 片段
 * @author hechenwe@gmail.com
 *  
 *
 */
public class DNAFragment {

	private String fragmentName;
	private String fragmentCode;
	private Integer codeLength;
	public String getFragmentName() {
		return fragmentName;
	}
	public void setFragmentName(String fragmentName) {
		this.fragmentName = fragmentName;
	}
	public String getFragmentCode() {
		return fragmentCode;
	}
	public void setFragmentCode(String fragmentCode) {
		this.fragmentCode = fragmentCode;
	}
	public Integer getCodeLength() {
		return codeLength;
	}
	public void setCodeLength(Integer codeLength) {
		this.codeLength = codeLength;
	}
	@Override
	public String toString() {
		return "DNAFragment [fragmentName=" + fragmentName + ", fragmentCode=" + fragmentCode + ", codeLength=" + codeLength + "]";
	}
	
	
	
}
