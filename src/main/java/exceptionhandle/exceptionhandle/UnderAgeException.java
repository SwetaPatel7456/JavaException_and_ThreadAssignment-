package exceptionhandle.exceptionhandle;

public class UnderAgeException extends RuntimeException{
	public UnderAgeException() {
		super("Your age is less than 18");
	}
	public UnderAgeException(String s) {
		super(s);
	}
	

}
