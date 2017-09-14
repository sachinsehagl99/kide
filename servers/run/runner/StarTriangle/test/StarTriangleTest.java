import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class StarTriangleTest extends Base
 {

     @Test
   public void t1() throws java.io.IOException{
         description = "call the main fucntion";
	StarTriangle obj = new StarTriangle();
		try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("    *\n   **\n  ***\n ****\n*****\n", outContent.toString().toLowerCase());
     

    		}
        }
	catch(Exception e){}
    
        }

   }

    

