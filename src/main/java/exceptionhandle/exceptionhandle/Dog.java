package exceptionhandle.exceptionhandle;

public class Dog extends Animal{
	String n;
	public Dog() {
		super();
		
	}
	
	public Dog(String name) {
		this(5);
		n = name;
		
	}
	public Dog(int id ) {
		System.out.println("Dog name is " + n + " "+ id);
	}
	
	

}
