class Student{
	String name="Aaraby";
	int marks=100;
	
	Student(){
		name="NoName";
	}
	
	Student(String n){
		name=n;
		
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from StudentDemo class");
		System.out.println("Creating an object of Studentclass");
		Student s1=new Student("Nice Name",70);
		
		System.out.println("Creating an object of Studentclass");
		System.out.println("Name of the object is "+s1.name);
		System.out.println("Marks of the object is "+s1.marks);
		
		s1.name="Bob";
		s1.marks=80;
		
		System.out.println("Name of the object is "+s1.name);
		System.out.println("Marks of the object is "+s1.marks);
	}
}