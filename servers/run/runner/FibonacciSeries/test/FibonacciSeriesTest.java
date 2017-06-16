import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class FibonacciSeriesTest extends Base
 {

    @Test 
    public void t1() {
      description = "1.lets find the Fibonacci Series using 'fiboseries',return the result";
    
      int n=5;	
      FibonacciSeries obj = new FibonacciSeries();
      try{
	Method m=getMethod(obj,"fiboseries");
		if(m!=null)
		{
                        m.invoke(obj, n);
			assertEquals("0\n1\n1\n2\n3\n",outContent.toString());
		}
	}
	catch(Exception e){}
    }
   @Test
   public void t2() throws java.io.IOException{
         description = "call the main fucntion";
	FibonacciSeries obj = new FibonacciSeries();
	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("Enter value of n:\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   }

    

