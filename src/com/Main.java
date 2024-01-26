package com;

public class Main 
{
	
	    public static void main(String[] args) {
	        PayrollSystem payrollSystem = new PayrollSystem();

	        FullTimeEmployee emp1 = new FullTimeEmployee("Sachin", 101, 5000.0);
	        PartTimeEmployee emp2 = new PartTimeEmployee("Cummins", 102, 30, 300.0);

	        payrollSystem.addEmployee(emp1);
	        payrollSystem.addEmployee(emp2);

	        System.out.println("Initial Employee Details:");
	        payrollSystem.displayEmployees();

	        System.out.println("\nRemoving Employee...");
	        payrollSystem.removeEmployee(101);

	        System.out.println("\nRemaining Employee Details:");
	        payrollSystem.displayEmployees();
	    }
	}


