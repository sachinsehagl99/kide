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
    public void t1() {
      description = "Find the summation of the cube of the digits of a number using a function named 'arm'";
      int a=371;
      int b = 0;
      Armstrong obj = new Armstrong();
      try {
	Method m=getMethod(obj,"arm");
		if(m!=null)
		{
			b = Integer.parseInt(m.invoke(obj, a).toString());
    			assertEquals(371, b);
        	}
        }
	catch(Exception e){}


     }

    @Test
    public void t2() {
       description = "Check between the armstrong number and the original a function named 'check'";
      Armstrong obj = new Armstrong();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 371,371).toString());
    			assertEquals(1, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
    public void t3() {
     description = "Check between the armstrong number and the original a function named 'check'";
      Armstrong obj = new Armstrong();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 121,10).toString());
    			assertEquals(0, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
   public void t4() throws java.io.IOException{
        description = "call the main fucntion";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\narmstrong\n", outContent.toString());
     
    		}
        }
	catch(Exception e){}
    
        }

   @Test
   public void t5() throws java.io.IOException{
       description = "call the main fucntion";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nnot armstrong\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }
}

