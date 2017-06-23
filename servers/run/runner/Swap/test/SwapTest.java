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
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	Swap obj = new Swap();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

    @Test
    public void t2() throws java.io.IOException{
	description = "2. Write a print statement and print 'Enter the value of a:'and 'Enter the value of b:',Write a input statements and input integer variablea , b";
	Swap obj = new Swap();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}
    @Test
    public void t3() throws java.io.IOException{
	description = "3. Write logic to swap two numbers using third variable and print the value of third variable";
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
    public void t4() throws java.io.IOException{
	description = "4. After Swap print the value of a and b using print statement";
	Swap obj = new Swap();
 		System.setIn(StubbedInputStream.stubInputStream().toReturn("10").then("20").atSomePoint());	 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of a:Enter the value of b:10\nAfter swaping:\nValue of a:20\nValue of b:10\n", outContent.toString());
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

