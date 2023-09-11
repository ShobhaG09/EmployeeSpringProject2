package com.spring;

import java.util.Date;

public class Employee 
{
	private Integer empNo;
	private String empName;
	private Double empSal;
	private Date empDoj;
	private Address empAddress;
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
//	public Employee(Integer empNo, String empName, Double empSal, Date empDoj, Address empAddress) {
//		super();
//		this.empNo = empNo;
//		this.empName = empName;
//		this.empSal = empSal;
//		this.empDoj = empDoj;
//		this.empAddress = empAddress;
//	}
	
	@Override
	public String toString() {
		System.out.println("------------------------------------------------");
		System.out.println(" ***************Employee Details*************** ");
		return "Employee Details => \n empNo=" + empNo + "\n empName=" + empName + "\n empSal=" + empSal + "\n empDoj=" + empDoj
				+ "\n empAddress :" + empAddress ;
	}

	

}
