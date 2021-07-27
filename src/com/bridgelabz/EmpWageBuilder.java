package com.bridgelabz;

public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to EmpWage Computation");
     
     int is_present = 1;
		int emp_check = (int)(Math.floor(Math.random() * 10)) % 2;
		if( emp_check == is_present)
		{
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");
	}

}
