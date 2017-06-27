import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class SwapTest extends Base
 {
   @Test
   public void t1() throws java.io.IOException{
         description = "Create a main method";
	Swap obj = new Swap();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

    @Test
    public void t2() throws java.io.IOException{
	description = "Take input in variable 'a'";
	Swap obj = new Swap();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("10").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:10", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

    @Test
    public void t3() throws java.io.IOException{
	description = "Take input in variable 'b'";
	Swap obj = new Swap();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:20\n", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

    	@Test
    public void t4() throws java.io.IOException{
	description = "Put the value of 'a' in 'temp' variable";
	Swap obj = new Swap();
 		System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());	 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:10\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
public void t5() throws java.io.IOException {
  description = "Put the value of 'b' in 'a' variable";  
  Swap obj = new Swap();

 		System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());	 	try {

	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:20\n", outContent.toString());
	   	}

	   }
	   catch(Exception e){}
}


@Test
public void t6() throws java.io.IOException {
  description = "Put the value of 'temp' in 'b' variable";  
  Swap obj = new Swap();

 		System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());	 	try {

	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:10\n", outContent.toString());
	   	}

	   }
	   catch(Exception e){}
}

	
}

