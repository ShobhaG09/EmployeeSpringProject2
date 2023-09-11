package com.spring;

public class Address 
{
	private Integer  houseNo;
	private String houseName;
	private  String pinCode;
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		System.out.println("-------------------------------------------------");
		return "\nAddress => \n houseNo=" + houseNo + "\n houseName=" + houseName + "\n pinCode=" + pinCode ;
	}
}
