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
	   description = "Initailize a main function using throws IOEXception Example 'public static void main()throws IOEXception{ *program*} ";
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
	   description = " Within the code part of main write the code line to input and use the tag 'Input a number'";
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
	   description = "Write an if else statment to check if the input is 1 or 2 then print 'The number is prime' ";
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
	   description = "Write an if else statment to check if the input is 1 or 2 then print 'The number is prime' ";
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
	   description = "within the else statment run a for loop from 2 till one less than the inputed number and print all the numbers in loop varriable using only print statement";
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
	   description = "within the for loop use an if else statement to check if the inputed number is divisible by the value in loop varriable an print them within the if else segment ";
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
	   description = "within the if else statment increment the value of the flag varriable which needs to be initialized at the start of the main with an initial value zero and print the vaule of flag within the if else";
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
	   description = "exit the for loop and then using aa if else statement check if the value of the flag varriable is zero or not";
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
	   description = "exit the for loop and then using aa if else statement check if the value of the flag varriable is zero or not";
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


}

