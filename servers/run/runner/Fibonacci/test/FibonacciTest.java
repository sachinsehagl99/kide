import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class FibonacciTest extends Base
 {

    @Test 
    public void t1() {
      description = "1.lets find the Fibonacci Series using 'fibo',return the end result";
    
      int n=5;	
      Fibonacci obj = new Fibonacci();
      try{
	Method m=getMethod(obj,"fibo");
		if(m!=null)
		{
			int b=Integer.parseInt(m.invoke(obj,n).toString());
			assertEquals(8,b);
		}
	}
	catch(Exception e){}
    }
   @Test
   public void t2() throws java.io.IOException{
         description = "call the main fucntion";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("Enter value of n:\nFibonacci Series:8\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   }

    

