import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class HelloWorldTest extends Base
 {

   /* @Test 
    public void t1() {
      description = "1.lets print 'Hello World' using 'helloworld'";
    
      String a = "Hello World";
      String b ="";	
      HelloWorld obj = new HelloWorld();
      try{
	Method m=getMethod(obj,"helloworld");
		if(m!=null)
		{
                        b = m.invoke(obj,a).toString();
			assertEquals("Hello World!",b);		
		}
	}
	catch(Exception e){}
    }*/
   @Test
   public void t1() throws java.io.IOException{
         description = "call the main fucntion";
	HelloWorld obj = new HelloWorld();
	//ByteArrayInputStream in = new ByteArrayInputStream("Hello World".getBytes());
	//System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("Hello World!\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   }

    

