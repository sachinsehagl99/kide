import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PerfectTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	Perfect obj = new Perfect();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
	public void t2() throws java.io.IOException{
		description = "2. Write a print statement and print 'Enter a number:'. Write a input statement and input a integer value.";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t3() throws java.io.IOException{
		description = "3. Start a for loop";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n3\n7\n14\n28\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
		@Test
	public void t4() throws java.io.IOException{
		description = "4. After ending a for-loop start a if-statement to check if the sum is eual to the inputed value and print 'Number is Perfect'";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n3\n7\n14\n28\nNumber is Perfect\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t5() throws java.io.IOException{
		description = "5. Write a else-statement to print 'Number is not Perfect'";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n4\n41\nNumber is not Perfect\n", outContent.toString());
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

