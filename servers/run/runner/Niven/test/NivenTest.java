import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class NivenTest extends Base
 {

 @Test
   public void t1() throws java.io.IOException{
         description = "1. Initialize a main function. Ex-'public static void main() throws java.io.IOException{}' ";
	Niven obj = new Niven();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }


	@Test
	public void t2() throws java.io.IOException{
		description = "2. Write a print statement and print 'Enter a number:'. Write a input statement and input a integer value.";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
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
		description = "3. Copy the inputed integer value into another variable and print the value of it";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:111\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
@Test
	public void t4() throws java.io.IOException{
		description = "4. Start a while-loop to extract the number and add them after extraction untill the inputed number is greater than 0. Print the value of sum of digits";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:111\n1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t5() throws java.io.IOException{
		description = "5. Write a if-statement to check if the inputed number is divisable by the sum of digits and print 'Number is a Niven Number.'";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:111\n1\n2\n3\nNumber is a Niven Number.\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t6() throws java.io.IOException{
		description = "6. Write a else-statement to print 'Number is not a Niven Number.'";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:28\n8\n10\nNumber is not a Niven Number.\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
@Test
	public void t7(){
		description = "You have succefully Compeleted the program!!!!";
		try{
		assertEquals(0,0);
		   }
		catch(Exception e){}
	
	}











   }

