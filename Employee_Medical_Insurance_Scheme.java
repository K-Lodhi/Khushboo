package org.khushi;

	public class Employee {
	    private int id;
	    private String name;
	    private String gender;
	    private int age;
	    private double salary;
	    private String designation;
	    private String insuranceScheme;

	    
	    public Employee(int id, String name, String gender, int age, double salary, String designation) {
	        this.id = id;
	        this.name = name;
	        this.gender = gender;
	        this.age = age;
	        this.salary = salary;
	        this.designation = designation;
	        this.insuranceScheme = determineInsuranceScheme();
	    }

	    
	    private String determineInsuranceScheme() {
	        if (salary < 5000) {
	            return "No Scheme";
	        } else if (salary >= 5000 && salary < 20000 && designation.equals("System Associate")) {
	            return "Scheme C";
	        } else if (salary >= 20000 && salary < 40000 && designation.equals("Programmer")) {
	            return "Scheme B";
	        } else if (salary >= 40000 && designation.equals("Manager")) {
	            return "Scheme A";
	        } else {
	            return "No Scheme";  // Default case if no conditions match
	        }
	    }

	   
	    public void displayEmployeeDetails() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	        System.out.println("Designation: " + designation);
	        System.out.println("Insurance Scheme: " + insuranceScheme);
	    }

	    public static void main(String[] args) {
	        Employee employee1 = new Employee(1, "John Doe", "Male", 28, 15000, "System Associate");
	        Employee employee2 = new Employee(2, "Jane Smith", "Female", 32, 25000, "Programmer");
	        Employee employee3 = new Employee(3, "Sam Brown", "Male", 45, 5000, "Clerk");
	        Employee employee4 = new Employee(4, "Emily White", "Female", 40, 45000, "Manager");

	        employee1.displayEmployeeDetails();
	        employee2.displayEmployeeDetails();
	        employee3.displayEmployeeDetails();
	        employee4.displayEmployeeDetails();
	    }
	}



