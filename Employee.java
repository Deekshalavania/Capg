package com.cg.eis.bean;

public abstract class Employee {
  int id;
  String name;
  float salary;
  String desg;
  abstract void insuranceScheme();

}
class Scheme extends Employee
{
	if(salary<5000 && salary<20000)
	{
		System.out.println("Scheme C");
	}
	else if(salary>=20000 && salary<40000)
	{
		System.out.println("Scheme B");
	}
	else if(salary>=40000)
	{
		System.out.println("Scheme A");
	}
	else if(salary>=40000)
	{
		System.out.println("No Scheme ");
	}
}