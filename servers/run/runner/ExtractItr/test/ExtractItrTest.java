import java.io.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ExtractItrTest extends Base
 {
	@Test
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        ExtractItr obj = new ExtractItr();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void ExtractItr.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	ExtractItr obj = new ExtractItr();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{

		    m.invoke(obj);
                    Object br = Base.getDebuggingObject();
		    assertEquals("java.io.BufferedReader", br.getClass().getName());
		   
		   }
	   } catch(Exception e){
             assertEquals(1, 0);
           }
	}


	@Test
    public void t3() throws java.io.IOException{
	hint = "a = Integer.parseInt(br.readLine());\n";
	description = "Take a input in 'a' variable";
	ExtractItr obj = new ExtractItr();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\n134After Extraction:\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t4() throws java.io.IOException{
	hint = "r=a%10;\na=a/10;\n";
	description = "Extract number using while-loop";
	ExtractItr obj = new ExtractItr();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:\nAfter Extraction:\n4\n3\n1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}



 }
