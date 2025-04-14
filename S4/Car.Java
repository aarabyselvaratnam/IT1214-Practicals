//Write a java program to create a Car class with private field Model.
//Provide a getter and setter method for model.
//In the main class, Create an object of car,set the ,model name to "Toyota Corolla"
//and print it.

class Car{

private String Model;

//Getter

public String getModel(){
	return Model;
}

//Setter
public void setModel(String newModel){
	this.Model=newModel;
}

}

public class Main{

public static void main(String args[]){
		Car c1=new Car();
		c1.setModel("Toyota Corolla");
		System.out.println(c1.getModel());
	}
}