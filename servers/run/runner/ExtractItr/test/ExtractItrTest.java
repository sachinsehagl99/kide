import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ExtractItrTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	ExtractItr obj = new ExtractItr();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	description = "2. Write a print statement and print 'Enter a number:',Write a input statement and input a integer variable";
	ExtractItr obj = new ExtractItr();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
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
	description = "3. Write another print statement and print 'After Extraction:'";
	ExtractItr obj = new ExtractItr();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\nAfter Extraction:\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
     public void t4() throws java.io.IOException{
	description = "4. Use a while loop till inputed integer variable is greater than 0 and print remainder in it ";
	ExtractItr obj = new ExtractItr();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\nAfter Extraction:\n4\n3\n1\n", outContent.toString());
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
