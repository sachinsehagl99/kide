import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PalindromeTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	Palindrome obj = new Palindrome();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }


	@Test
	public void t2() throws java.io.IOException{
		description = "2. Write a print statement and print 'Enter a number:'. 3. Write a input statement and input a integer value.";
	Palindrome obj = new Palindrome();
 	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t3() throws java.io.IOException{
		description = "4. Copy the inputed value into another integer type varriable and then print it using print statement.";
	Palindrome obj = new Palindrome();
 	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n121\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t4() throws java.io.IOException{
		description = "5. Write a while loop to extract the number until the number is greater than 0 and print the remainder value.";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n121\n1\n2\n1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t5() throws java.io.IOException{
		description = "6. Within the While loop print the sum value after extraction.";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n121\n1\n1\n2\n12\n1\n121\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t6() throws java.io.IOException{
		description = "7. Write a if statement to check the number is palindrome or not";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n121\n1\n1\n2\n12\n1\n121\npalindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t7() throws java.io.IOException{
		description = "8. Write a else statement to print the number 'not palindrome'.";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n10\n0\n0\n1\n1\nnot palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t8(){
		description = "You have succefully Compeleted the program!!!!";
		try{
		assertEquals(0,0);
		   }
		catch(Exception e){}
	
	}



}



















    
