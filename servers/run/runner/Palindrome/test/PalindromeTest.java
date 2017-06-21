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
         description = "Initialize a main function using throws IOException ,Example-public static void main() throws java.io.IOException{program}";
	Palindrome obj = new Palindrome();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }


	@Test
	public void t2() throws java.io.IOException{
		description = " Within the code part of main write the code line to input and use the tag 'Enter a number'";
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
		description = "Store the value of a in integer type variable and print it";
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
		description = "Write a while loop to extract the number until the number is greater than 0 and print the remainder value";
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
		description = "Within the While loop print the sum value after extraction";
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
		description = "Write a if statement to check the number is palindrome or not";
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
		description = "Write a else statement to check the number is palindrome or not";
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



}



















    
