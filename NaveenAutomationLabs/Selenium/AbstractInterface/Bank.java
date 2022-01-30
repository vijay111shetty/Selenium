package AbstractInterface;

public abstract class Bank { 
	
	public abstract void loan();//abstract method--no method body
	//we cannot create the object of abstract class 
	
	public void credit()
	{
		System.out.println("abstract class credit method");
	}
	public void debit()
	{
		System.out.println("abstract class debit method");
	}
	

}
