package com.rays.inheritencetableperclass;

public class Cheque extends Payment{
	private int chqNumber;
	private String bankName;
	public int getChqNumber() {
		return chqNumber;
	}
	public void setChqNumber(int chqNumber) {
		this.chqNumber = chqNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

}
