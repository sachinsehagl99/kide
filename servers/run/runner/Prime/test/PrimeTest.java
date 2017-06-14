import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class PrimeTest extends Base
 {

    @Test 
    public void t1() {
      description = "lets find if the number is prime and return 0 using 'prime_check'";
    
      int a=7;
	int b=0;	
      Prime obj = new Prime();
      try{
	Method m=getMethod(obj,"prime_check");
		if(m!=null)
		{
			b=Integer.parseInt(m.invoke(obj,a).toString());
			assertEquals(0,b);
		}
	}
	catch(Exception e){}
	}
    @Test
    public void t2() {
    description = "lets find if the number is  prime and return 1 using 'prime_check'";

      int a=6;
      int b=0;
      Prime obj = new Prime();
      try{
	Method m=getMethod(obj,"prime_check");
		if(m!=null)
		{
			b=Integer.parseInt(m.invoke(obj,a).toString());
			assertEquals(1,b);
		}
	}
	catch(Exception e){}
    }


   @Test
   public void t3() throws java.io.IOException{
         description = "call the main fucntion";
	Prime obj = new Prime();
	ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nprime\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   @Test
   public void t4() throws java.io.IOException{
       description = "call the main fucntion";
	Prime obj = new Prime();
	ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nnot prime\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    

        }
}

