class Student{
	int marks;
	String name;
	
	Student()//null constructor
	{

		System.out.println("Creating a Student Object");
		name="Default Name";
	}
	
	Student(String n,int m){

		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
		name=n;
		
	}
	
	
}



class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo class App");
		Student s1=new Student();
		System.out.println("The name of the student s1 = "+s1.name);
		System.out.println("The marks of the student s1 = "+s1.marks);
		s1.marks=100;
		s1.name="Alice";
		System.out.println("The name of the student s1 = "+s1.name);
		System.out.println("The marks of the student s1 = "+s1.marks);
		
		
		Student s2=new Student("Bob",50);
		System.out.println("The name of the student s2 = "+s2.name);
		System.out.println("The marks of the student s2 = "+s2.marks);
		
	}
}