package exceptionhandle.exceptionhandle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        	try {
            	System.out.println("Hii");
        	}
        	catch(Exception q) {
        		
        	}
        int a = 10/0;
        System.out.println(a);
        
        
         }
        catch(Exception b) {
         try {
        	 System.out.println("Hey");
        	}
        	catch(Exception e) {
        		System.out.println("d");
        	}
        	
        }
     
        finally {
        	try {
        		
        	}
        	catch(Exception c) {
        		System.out.println("c");
        	}
        }
    }
}
