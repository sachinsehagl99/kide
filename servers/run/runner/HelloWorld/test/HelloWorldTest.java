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

   @Test
   public void t1() throws java.io.IOException{
         description = "Initialize a main function using throws IOException ,Example-public static void main() throws java.io.IOException{program}";
	HelloWorld obj = new HelloWorld();
	try {
		Method m=getMethod(obj,"main");
	        assertEquals(m.getName(),"main");
     

    		}
        
	catch(Exception e){}
    
        }

   
 

    @Test
   public void t2() throws java.io.IOException{
         description = "Within the code part of main write the code line to print 'Hello World'";
	HelloWorld obj = new HelloWorld();
	try {
		Method m=getMethod(obj,"main");
		if(m!= null)
		{
		m.invoke(obj);
	        assertEquals("Hello World!\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   }


    

