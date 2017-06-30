import java.io.*;
import java.util.*;
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
	hint = new Scanner(new File("Hint/h1.txt")).useDelimiter("\\Z").next();
        description = "Create a main method";
	Extract obj = new Extract();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
		
            }
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	hint = new Scanner(new File("Hint/h2.txt")).useDelimiter("\\Z").next();
	description = "2. Take input in variable 'a'";
	Extract obj = new Extract();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\n134", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t3() throws java.io.IOException{
	hint = new Scanner(new File("Hint/h3.txt")).useDelimiter("\\Z").next();
	description = "3. Extract ones position value";
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
	hint = new Scanner(new File("Hint/h4.txt")).useDelimiter("\\Z").next();
	description = "4. Extract tens position value";
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
	hint = new Scanner(new File("Hint/h5.txt")).useDelimiter("\\Z").next();
	description = "5. Extract hundreds position value";
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

	
 }
