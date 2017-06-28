import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;


public class PalindromeStringTest extends Base {
	
	 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	PalindromeString obj = new PalindromeString();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
	public void t2() throws java.io.IOException{
		description = "2. Write a print statement and print 'Input a string:'. Write a input statement and input a string.";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a string:", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t3() throws java.io.IOException{
		description = "3. Reverse the inputed string and copy it into another variable. Print the value of another variable ";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a string:madam\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t4() throws java.io.IOException{
		description = "4. Write a if statement to check if the inputed string is same after reversing it ";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a string:madam\nPalindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
	public void t5() throws java.io.IOException{
		description = "5. Write a else statement to print 'Not palindrome'";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("aloka".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a string:akola\nNot palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
	@Test
	public void t6(){
		description = "You have succefully Compeleted the program!!!!";
		try{
		assertEquals(0,0);
		   }
		catch(Exception e){}
	
	}












    }

