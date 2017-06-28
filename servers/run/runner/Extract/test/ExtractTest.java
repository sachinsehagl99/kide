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
