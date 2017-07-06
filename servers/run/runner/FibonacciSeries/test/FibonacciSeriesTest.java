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
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        FibonacciSeries obj = new FibonacciSeries();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void FibonacciSeries.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	FibonacciSeries obj = new FibonacciSeries();	
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
	description = "Take input in variable n";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of n:5\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t4() throws java.io.IOException{
	hint = "int a = 0,b=1,c;\nSystem.out.println(a);\nSystem.out.println(b);\n";
	description = "Initialize variable a=0, b=1, c and print the value of 'a' and 'b'";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of n:Fibonacci Series:\n0\n1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t5() throws java.io.IOException{
	hint = "for(int i = 3; i <= n; i++)\n{\nc=a+b;\nSystem.out.println(c);\na=b;\nb=c;\n}\n";
	description = "Start a for loop for fixed number of iterations and write necessary code within it";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter the value of n:Fibonacci Series:\n0\n1\n1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	


   }

    

