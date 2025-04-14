/*write a java program to create a Car class with private field Model.
provide a getter and setter method for the model.
In the main vlass, Create an object of Car, set the model name to "Toyota Corolla"
and print it.*/

class Car
{

private String model;

//Getter
public String getModel()
{
	return model;
}

//Setter
public void setModel(String newModel)
{
	this.model=newModel;
}

}

public class Ex
{
	public static void main(String args[])
	{
		Car c1=new Car();
		c1.setModel("Toyota Corolla");
		System.out.println(c1.getModel());
	}
}
