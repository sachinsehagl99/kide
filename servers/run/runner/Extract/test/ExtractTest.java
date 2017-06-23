import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ExtractTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	Extract obj = new Extract();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	description = "2. Write a print statement and print 'Enter a three digit number:',Write a input statement and input a integer variable";
	Extract obj = new Extract();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t3() throws java.io.IOException{
	description = "3. Extract the number and print ones position value of the inputed number";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
     public void t4() throws java.io.IOException{
	description = "4. Extract the number and print tens position value of the inputed number";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\nTens position:3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
   public void t5() throws java.io.IOException{
	description = "5. Extract the number and print hundreds position value of the inputed number";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\nTens position:3\nHundreds position:1\n", outContent.toString());
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
