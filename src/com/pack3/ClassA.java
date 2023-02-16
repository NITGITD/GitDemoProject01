package com.pack3;

public class ClassA {

	private Integer id;
	private String name;
	private Double salary;
	public ClassA(Integer id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "ClassA [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
