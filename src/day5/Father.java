package day5;

public class Father {
	
	//state
	String name;
	int age;
	
	//behavior
	
	public void works() {
		if(age>20) {
		
		System.out.println("Goes to work");
		}
		else {
			System.out.println("Too young");
		}
	}
	
	public void eatsForLunch() {
		System.out.println("dal bhat Tarkari");
	}
	

}
