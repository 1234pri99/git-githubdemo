package com.merge;

public class SecondaryData {
	private Integer Mobile_number;
	private String Address;
	public SecondaryData() {}
	public Integer getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(Integer mobile_number) {
		Mobile_number = mobile_number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "SecondaryData [Mobile_number=" + Mobile_number + ", Address=" + Address + "]";
	}
	

}
