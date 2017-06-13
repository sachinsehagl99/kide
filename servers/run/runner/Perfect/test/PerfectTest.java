import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PerfectTest extends Base
 {

  @Test
    public void t1() {
       description = "Find the sum of the factors using a function 'perfectsum'";
      int a=6;
      int b = 0;
     Perfect obj = new Perfect();
      try {
	Method m=getMethod(obj,"perfectSum");
		if(m!=null)
		{
			b = Integer.parseInt(m.invoke(obj, a).toString());
    			assertEquals(6, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
    public void t2() {
       description = "Check between the sum of the factors and the original using a function named 'check'";
       Perfect obj = new Perfect();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 6,6).toString());
    			assertEquals(1, b);
        	}
        }
	catch(Exception e){}
     }


    @Test
    public void t3() {
       description = "Check between the sum of the factors and the original a function named 'check'";
      Perfect obj = new Perfect();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 7,1).toString());
    			assertEquals(0, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
   public void t4() throws java.io.IOException{
        description = "call the main fucntion";
	Perfect obj = new Perfect();
	ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nperfect\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    }

   @Test
   public void t5() throws java.io.IOException{
	 description = "call the main fucntion";
	Perfect obj = new Perfect();
	ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nnot perfect\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    

        }
}

