package Comparator;

public class ClassA/* implements Comparable<ClassA>*/ {

	private String empName;
	private int empId;
	private String empDept;
	public ClassA(String empName,int empId,	String empDept) {
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	
	@Override
	public String toString() {
		return "ClassA [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}

	public String getEmpName() {
		return empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpDept() {
		return empDept;
	}

	/*@Override
	public int compareTo(ClassA o) {
		
		//return this.empId-o.empId;
		//return this.empName.compareTo(o.empName);
		return this.empDept.compareTo(o.empDept);
	}*/
	
}
