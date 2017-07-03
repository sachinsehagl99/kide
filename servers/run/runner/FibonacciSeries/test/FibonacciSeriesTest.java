import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class FibonacciSeriesTest extends Base
 {

@Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	FibonacciSeries obj = new FibonacciSeries();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
	public void t2() throws java.io.IOException{
		description = "2. Write a print statement and print 'Enter the value:'. Write a input statement and input a integer value.";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value:", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t3() throws java.io.IOException{
		description = "3. Initialize a=0 and b=1 and print the value of a and b using print statement";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value:0\n1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t4() throws java.io.IOException{
		description = "4. Start a for loop from 3, till the loop variable is less equal to the inputed number. Print the value of c within it";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value:0\n1\n1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t5(){
		description = "You have succefully Compeleted the program!!!!";
		try{
		assertEquals(0,0);
		   }
		catch(Exception e){}
	
	}





   


   }

    

