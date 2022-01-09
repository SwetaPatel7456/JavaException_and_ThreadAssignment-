package exceptionhandle.exceptionhandle;

import java.io.FileNotFoundException;

public class writeandread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Read r = new Read();
		r.readfile();
		}
		catch(FileNotFoundException e) {
			
		}
	}

}
