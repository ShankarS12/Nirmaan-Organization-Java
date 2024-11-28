package day5;

public class Student {
	
	String name;
	int Age;
	int rollno;
	String DOB;
	
	Student(){
		this.name = "Sanjay";
	}
	
	public static void main (String []args) {
		Student s1 = new Student();
		
		//s1.name = "Shankar";
		System.out.println(s1.name);
		
		s1.Age = 21;
		System.out.println(s1.Age);
		
		s1.rollno  =1067;
		System.out.println(s1.rollno);
		
		s1.DOB = "12/9/2003";
		System.out.println(s1.DOB);
		
		Student s2 = new Student();
		s2.name = "Praveen";
		
		System.out.println(s2.name);
		
	}

}
