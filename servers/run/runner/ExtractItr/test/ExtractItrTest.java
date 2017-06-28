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
         description = "Create a main method";
	ExtractItr obj = new ExtractItr();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	description = "Take a input in 'a' variable";
	ExtractItr obj = new ExtractItr();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n134After Extraction:\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t3() throws java.io.IOException{
	description = "Extract number using while-loop";
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



 }
