import java.io.*;
import java.util.*;
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
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        HelloWorld obj = new HelloWorld();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void HelloWorld.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }

    @Test
   public void t2() throws java.io.IOException{
	hint = "System.out.println(\"Hello World!\");\n";
        description = "Print 'Hello World!'";
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


    

