package com.citiustech.eis.pl;

import com.citiustech.eis.bean.Employee;

public class outputclass {
public static void main(String args[])
{
	Employee e1=new Employee(122,"name1",33232,"employee","someinsurance");
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
	System.out.println(e1.getDesignation());
	System.out.println(e1.getInsurancescheme());
	
	System.out.println("insdata based on parameters");
	if(e1.getSalary()>10000)
	{
		e1.setinsurancedata("data1");
	}
	else
	{
		e1.setinsurancedata("data2");
	}
	System.out.println(e1.getinsurancedata());
}
}
