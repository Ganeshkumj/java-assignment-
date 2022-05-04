package com.citiustech.eis.service;

import com.citiustech.eis.bean.Employee;

interface employeeservice{
	void getinsuranceschemedata();
	
}
public class Employeeserviceimpl implements employeeservice {
	
	@Override
	public void getinsuranceschemedata() {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setinsurancedata("data1");
		System.out.println(e1.getinsurancedata());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
