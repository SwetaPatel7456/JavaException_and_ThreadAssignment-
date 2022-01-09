package exceptionhandle.exceptionhandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Read {
	//throws keyword is used to handle checked exception
	public void readfile() throws FileNotFoundException {
		
			FileInputStream fis = new FileInputStream("abc.txt");
		
	}
	
	public void writefile() throws FileNotFoundException{
		
			FileOutputStream fos = new FileOutputStream( "def.txt");
	
		}
		
	}
