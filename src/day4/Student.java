package day4;

public class Student {
	
	//blueprint
	//state
	//variables
	//What does a class have??
	
	String name;
	int age;
	String major;	

	//behaviour
	//Functions/methods;
	//What does a class do?
	
	public void displayDetails() {
		System.out.println(name + " : " +age);
	}
	
	public void studies() {
		System.out.println("Is studuing" + major);
	}
	
	
	//inheritance, Overriding;
	public void doesAssignments() {
		System.out.println("Doing Assignments Till 1 am.");
	}

}
