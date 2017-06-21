import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class PrimeTest extends Base
 {
	@Test
	public void t1() throws java.io.IOException 
	{
	   description = "1. Initailize a main function. Ex- 'public static void main() throws IOEXception{}' ";
	   Prime obj = new Prime();
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	assertEquals(m.getName(),"main");
	   }
	   catch(Exception e){}
	}
  	
	@Test
	public void t2() throws java.io.IOException 
	{
	   description = "2. Write a print statement and print 'Input a number'.3. Write a input statement and input a integer value";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	@Test
	public void t3() throws java.io.IOException 
	{
	   description = "4. Write an if statment to check if the input is 1 then print 'The number is prime' ";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\nThe number is prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	@Test
	public void t4() throws java.io.IOException 
	{
	   description = "5. Write within the if statment to check if the input is 2 then print 'The number is prime' ";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\nThe number is prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	
	@Test
	public void t5() throws java.io.IOException 
	{
	   description = "6. Within the else statment write a for loop from 2, till one less than the inputed number and print all the numbers in loop variable using only print statement";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

	@Test
	public void t6() throws java.io.IOException 
	{
	   description = "7. Within the for loop write an if statement to check if the inputed number is divisible by the value in loop varriable and print them within it ";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	
	@Test
	public void t7() throws java.io.IOException 
	{
	   description = "8. Within the if  statement increment the value of the flag varriable which needs to be initialized at the start of the main with an initial value zero and print the vaule of flag within the if";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n2\n3\n4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	
	@Test
	public void t8() throws java.io.IOException 
	{
	   description = "9. Close the for loop. Now use an if statement to check if the value of the flag varriable is zero or not";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n2\n3\n4\nThe Number is prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

	@Test
	public void t9() throws java.io.IOException 
	{
	   description = "10. After ending the if statement, use  else statement to print 'The Number is not prime'";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number\n2\n2\n1\n3\n3\n2\n4\n5\nThe Number is not prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}

	}


	@Test
       	public void t10() {
	    description="You have succefully Compeleted the program!!!!";
	    
	    
	    try
	    {
		    assertEquals(0,0);
	    }
	    catch(Exception e){
	    }

	 
        }
}




