import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class FibonacciTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
         description = "Create a main method";
	Fibonacci obj = new Fibonacci();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

		@Test
	public void t2() throws java.io.IOException{
		description = "Take a input in 'n' variable";
	Fibonacci obj = new Fibonacci();
 	ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in); 
 	try {
                	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t3() throws java.io.IOException{
		description = "Write necessary code within while-loop";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}



		
	@Test
	public void t4() throws java.io.IOException{
		description = "Check if c is equal to n and print 'Fibonacci'";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n2\n3\nFibonacci\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t5() throws java.io.IOException{
		description = "Print 'Not Fibonacci' using else";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n2\n3\n5\nNot Fibonacci\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


   
   }

    

