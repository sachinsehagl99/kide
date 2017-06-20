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
        description = "Initialize The main function 'public static void main(String args[])throws IOException{ code }' to write your program within the braces";
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
        description = "Within the braces of main write the code to input a number using the tag 'Input The number' in a integer type varriable";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                 assertEquals("Input The number\n",outContent.toString());		
			 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	        }
	@Test
	public void t3() throws java.io.IOException{
        description = "Within the braces of main write a code to copy the inputed value into another integer type varriable and then print it using System.out.println";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input The number\n371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t4() throws java.io.IOException{
        description = "Now use a do while loop to extract the digits of the number and print the digits at every step";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                   assertEquals("Input The number\n371\n1\n7\n3\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }
	@Test
	public void t5() throws java.io.IOException{
        description = "Within the do while loop find the sum of the cube of the digits and print at every step";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input The number\n371\n1\n1\n7\n344\n3\n371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t6() throws java.io.IOException{
        description = "After Ending the while loop check the summation of cube of digits with the duplicate of inputed number using a if else statement to check if it is armstrong or not";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input The number\n371\n1\n1\n7\n344\n3\n371\nThe Number is an Armstrong Number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
        description = "After Ending the while loop check the summation of cube of digits with the duplicate of inputed number using a if else statement to check if it is armstrong or not";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input The number\n121\n1\n1\n2\n9\n1\n10\nThe Number is not an Armstrong Number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){ System.err.println(e);
}
    	    
        }

 } 
