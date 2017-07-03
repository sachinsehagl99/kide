import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class ConsecutivePrimeTest extends Base
 {
	@Test
	public void t1() throws java.io.IOException 
	{
	   description = "1. Initailize a main function. Ex- 'public static void main() throws IOEXception{}' ";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	assertEquals(m.getName(),"main");
	   }
	   catch(Exception e){}
	}
  	
		@Test
	public void t2() throws java.io.IOException 
	{
	   description = "2. Write a print statements and print 'Enter the lower limit :','Enter the upper limit :' and 'The prime numbers in between the entered limits are :'.3. Write a input statement and input corresponding integer value";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

		@Test
	public void t3() throws java.io.IOException 
	{
	   description = "4. Write a for loop from lower limit to upper limit till the inputed upper limit and print all the numbers in loop variable using print statement";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n0\n1\n2\n3\n4\n5\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

	@Test
	public void t4() throws java.io.IOException 
	{
	   description = "5. Within for loop Write a for loop from 2, till one less than the inputed upper limit and print all the numbers in loop variable using print statement";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }


	@Test
	public void t5() throws java.io.IOException 
	{
	   description = "6. Within the for loop write an if statement to check if the inputed number is divisible by the value in loop varriable and print them within it and initialize flag=0 ";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

		@Test
	public void t6() throws java.io.IOException 
	{
	   description = "7.  Write a else statement to initialize flag = 1";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }


		@Test
	public void t7() throws java.io.IOException 
	{
	   description = "8. After closing for loop Write a if statement to check flag variable is one or not";
	   ConsecutivePrime obj = new ConsecutivePrime();
	   ByteArrayInputStream in = new ByteArrayInputStream("0,5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the lower limit :\nEnter the upper limit :\nThe prime numbers in between the entered limits are :\n2\n3\n4\n2\n3\n5\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

	@Test
       	public void t8() {
	    description="You have succefully Compeleted the program!!!!";
	    
	    
	    try
	    {
		    assertEquals(0,0);
	    }
	    catch(Exception e){
	    }

	 
        }





   }


