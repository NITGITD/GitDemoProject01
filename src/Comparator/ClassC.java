package Comparator;

import java.util.Comparator;

public class ClassC implements Comparator<ClassA>{

	@Override
	public int compare(ClassA o1, ClassA o2) {
		
		//return o1.getEmpId()-o2.getEmpId();
		//return o1.getEmpName().compareTo(o2.getEmpName());
		return o1.getEmpDept().compareTo(o2.getEmpDept());
	}

}
