import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class ConsecutivePrimeTest extends Base
 {
@Test
   public void t1() throws java.io.IOException{
         description = "call the main fucntion";
	ConsecutivePrime obj = new ConsecutivePrime();
	ByteArrayInputStream in = new ByteArrayInputStream("0,10".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("Enter the lower limit :\nEnter the Upper limit :\nThe prime numbers in between the entered limits are :\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   }


