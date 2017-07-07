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

public class FibonacciTest extends Base
 {
	  @Test
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Fibonacci obj = new Fibonacci();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Fibonacci.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Fibonacci obj = new Fibonacci();	
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
	hint = "n = Integer.parseInt(br.readLine());\n";
	description = "Take a input in 'n' variable";
	Fibonacci obj = new Fibonacci();
 	ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in); 
 	try {
                	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
    public void t4() throws java.io.IOException{
	hint = "c = a + b;\na = b;\nb = c;\n";
	description = "Write necessary code within while-loop";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}



		
	@Test
    public void t5() throws java.io.IOException{
	hint = "if(c==n)\nSystem.out.println(\"Fibonacci\");\n";
	description = "Check if c is equal to n and print 'Fibonacci'";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :Fibonacci\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
    public void t6() throws java.io.IOException{
	hint = "else {\nSystem.out.println(\"Not Fibonacci\");\n}";
	description = "Print 'Not Fibonacci' using else";
	Fibonacci obj = new Fibonacci();
	ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number :Not Fibonacci\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


   
   }

    

