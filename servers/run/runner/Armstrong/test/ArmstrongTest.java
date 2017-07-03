import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ArmstrongTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
        description = "1. Initialize The main function\nEx- 'public static void main()throws IOException{}'";
	Armstrong obj = new Armstrong();
	try {
		Method m=getMethod(obj,"main");
		 assertEquals(m.getName(),"main");

        }
	catch(Exception e){ System.err.println(e);
}
                
 }
   @Test
   public void t2() throws java.io.IOException{
        description = "2. Write a print Statement and print 'Input the number'\n,Write the input statement and Input a integer value.";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                 assertEquals("Input the number\n",outContent.toString());		
			 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	        }
	@Test
	public void t3() throws java.io.IOException{
        description = "3. Copy the inputed value into another integer type varriable and then print it using print statement";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number\n371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t4() throws java.io.IOException{
        description = "4. Now use a do-while loop to extract the digits of the number and print the digits at every step";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                   assertEquals("Input the number\n371\n1\n7\n3\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }
	@Test
	public void t5() throws java.io.IOException{
        description = "5. Next within the do-while loop find the sum of the cube of the digits and print it at every step";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number\n371\n1\n1\n7\n344\n3\n371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t6() throws java.io.IOException{
        description = "6. After Ending the while loop, check the resultant value with the duplicate of inputed number using a if statement to check if it is an armstrong number or not";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number\n371\n1\n1\n7\n344\n3\n371\nThe number is an armstrong number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
        description = "7. After Ending the if statement,use else statement to print 'The Number is not an Armstrong Number'";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number\n121\n1\n1\n2\n9\n1\n10\nThe number is not an armstrong number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);}
}
    	@Test
       	public void t8() {
	    description="You have succefully Compeleted the program!!!!";
	    
	    
	    try
	    {
		    assertEquals(0,0);
	    }
	    catch(Exception e){
	    }
	
	}	
        

 } 
