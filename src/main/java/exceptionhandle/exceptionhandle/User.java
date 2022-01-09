package exceptionhandle.exceptionhandle;

import java.time.LocalDate;

/*import java.io.FileNotFoundException;

public class User {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       Read rw = new Read();
       try {
		rw.readfile();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		rw.writefile();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println("Exception has handled");
	}

}*/

/*public class User {
	public static void main(String args[]) {
	Integer i = new Integer(5);
	Integer i1 = Integer.valueOf(5);
	Integer i2 = Integer.valueOf(5);
	
	if(i2==i1) {
		System.out.println("Hii");
	}
	else
		System.out.println("Hello");
	}
}*/

public class User {
	public static void main(String args[]) {
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfMonth());
		System.out.println(now.withDayOfMonth(2021));
	}
}


















