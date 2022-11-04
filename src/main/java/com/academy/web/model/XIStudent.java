package com.academy.web.model;

public class XIStudent {
	private int RollNo;
	private String StuName;
	private String Branchcode;
	private String Gender;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getBranchcode() {
		return Branchcode;
	}
	public void setBranchcode(String branchcode) {
		Branchcode = branchcode;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "XIStudent [RollNo=" + RollNo + ", StuName=" + StuName + ", Branchcode=" + Branchcode + ", Gender="
				+ Gender + "]";
	}
	
}
	