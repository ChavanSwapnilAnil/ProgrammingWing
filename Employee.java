package com.homeWork;

public class Employee 

{
	
	

	
	public void m1 ( int i , float f) 
	{
		System.out.println(+i +"  " +f);
		
	}
	public void m1 (float f, int i)
	{
		System.out.println(+f +"  "+i);
	}
public static void main(String[] args) 
{
	Employee e = new Employee ();
	e.m1(10,10.5f);
	e.m1(10.5f, 10);
	//e.m1(10, 10); 
	
	
	
}
}
