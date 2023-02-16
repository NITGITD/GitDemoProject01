package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> showAllEmployees() {
		List<Employee> list = empDAO.getAllEmployees();
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) {
		int count = empDAO.insertEmployee(emp);
		return count == 0 ? "Employee not inserted" : "Employee registered";
	}

	@Override
	public Employee fetchEmployeeByNo(int no) {
		Employee emp = empDAO.getEmployeeByNo(no);
		return emp;
	}

	@Override
	public String modifyEmployeeByNo(Employee emp) {
		int count = empDAO.updateEmployee(emp);

		return count == 0 ? "employee not found for updation" : "employee found and updated";
	}

	@Override
	public String removeEmployeeByNo(int no) {
		int count=empDAO.deleteEmployeeByNo(no);
		return count==0?"Employee not found for Deletion":"Employee found and deleted";
	}

}
