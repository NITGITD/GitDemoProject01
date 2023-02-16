package com.pack1;

public class ClassC {

	private String empName;
	private int empId;
	private String empDept;

	public ClassC(String empName,int empId,String empDept) {
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}

	@Override
	public String toString() {
		return "ClassC [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}
	
}
