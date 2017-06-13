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
    public void t1() {
        description = "Lets find the sum fo the digits using the fuction 'digit_sum'";
      int a=18;
      int b = 0;
      Niven obj = new Niven();
      try {
	Method m=getMethod(obj,"digit_sum");
		if(m!=null)
		{
			b = Integer.parseInt(m.invoke(obj, a).toString());
    			assertEquals(9, b);
        	}
        }
	catch(Exception e){}


     
      System.out.println("Find the sum of the digits");
     }

    @Test
    public void t2() {
       description = "lets check if the original number is divisible by the sum using the function 'check'";
      Niven obj = new Niven();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 18,9).toString());
    			assertEquals(1, b);
        	}
        }
	catch(Exception e){}
     }


    @Test
    public void t3() {
       description = "lets check if the original number is divisible by the sum using the function 'check'";
      Niven obj = new Niven();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 19,9).toString());
    			assertEquals(0, b);
        	}
        }
	catch(Exception e){}
      
      }

    @Test
   public void t4() throws java.io.IOException{
       description = "call the main fucntion";
	Niven obj = new Niven();
	ByteArrayInputStream in = new ByteArrayInputStream("18".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nniven\n", outContent.toString().toLowerCase());     

    		}
        }
	catch(Exception e){}
    }

   @Test
   public void t5() throws java.io.IOException{
        description = "call the main fucntion";
	Niven obj = new Niven();
	ByteArrayInputStream in = new ByteArrayInputStream("19".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nnot niven\n", outContent.toString().toLowerCase());     

    		}
        }
	catch(Exception e){}
    
     }
}

