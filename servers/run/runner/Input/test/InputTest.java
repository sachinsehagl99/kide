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

public class InputTest extends Base
 {

  @Test
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Input obj = new Input();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Input.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Input obj = new Input();	
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
	hint = "a = Integer.parseInt(br.readLine());";
        description = "Take a input in variable 'a'";
	Input obj = new Input();
	ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
	System.setIn(in); 
	try {
		Method m=getMethod(obj,"main");
		if(m!= null)
		{
		m.invoke(obj);
	        assertEquals("Enter a number:\n10\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }
  
 }


