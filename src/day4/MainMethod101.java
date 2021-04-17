package day4;

public class MainMethod101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object Initializate;;
		/*
		Student s1Urgyen = new Student();
		
		s1Urgyen.name = "Urgyen Shakya" ;
		s1Urgyen.age= 25;
		s1Urgyen.major ="CS" ;
		
		s1Urgyen.studies();
		s1Urgyen.doesAssignments();
		s1Urgyen.displayDetails();
		
		System.out.println( "------" );
		
		Student s1Abhimanyu = new Student();
		
		s1Abhimanyu.name = "Abhimanyu aa" ;
		s1Abhimanyu.age= 25;
		s1Abhimanyu.major ="Literature" ;
		
		s1Abhimanyu.studies();
		s1Abhimanyu.doesAssignments();
		s1Abhimanyu.displayDetails();
		*/
		
		Car c1 = new Car();
		c1.brandName = " Benz ";
		c1.color ="Black";
		c1.type = "Sedan" ;
		c1.tyreSize= 24;
		c1.startEngine();
		c1.transportPeople();
		System.out.println(c1.brandName + " : " + c1.color + " : " + c1.type);		
		
		System.out.println(" ---- ");
		
		Car c2 = new Car();
		c2.brandName = " Tesla ";
		c2.color ="White";
		c2.type = "X" ;
		c2.tyreSize= 18;
		c2.startEngine();
		c2.transportPeople();
		System.out.println(c2.brandName + " : " + c2.color + " : " + c2.type);
		
	}

}
