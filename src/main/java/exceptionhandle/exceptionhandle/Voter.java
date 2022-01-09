package exceptionhandle.exceptionhandle;

public class Voter {

	//throw keyword is used to handle unchecked exception
	public static void main(String[] args) {
		int age = 19;
		
		try {
		if(age <=18)
			throw new UnderAgeException();
		else
			System.out.println("u can give vote");
		
		}
		catch(UnderAgeException e) {
			System.out.println(e);
		}

	}

}
