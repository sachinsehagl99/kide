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
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        FibonacciSeries obj = new FibonacciSeries();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void FibonacciSeries.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	FibonacciSeries obj = new FibonacciSeries();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{
		    String args[]=new String[0];
		    m.invoke(obj,(Object)args);
                    Object br = Base.getDebuggingObject();
		    assertEquals("java.io.BufferedReader", br.getClass().getName());
		   
		   }
	   } catch(Exception e){
             assertEquals(1, 0);
           }
	}


@Test
	public void t3() throws java.io.IOException{
	instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	hint = "n = Integer.parseInt(br.readLine());\n";		
	description = "Take input in variable n";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		     String args[]=new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("enter the value of n:5\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t4() throws java.io.IOException{
	instruction = "System: It is a class in the java.lang package.\n\nout: It is a static member of the System\nclass, and is an instance of java.io.PrintStream.\n\nprintln: It is a method of java.io.PrintStream.\nThis method is overloaded to print message to\noutput destination, which is typically a\nconsole or file.";
	hint = "System.out.println(a);\nSystem.out.println(b);\n";
	description = "Print the value of 'a' and 'b'";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		     String args[]=new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("enter the value of n:fibonacci series:\n0\n1\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t5() throws java.io.IOException{
	instruction = "A for-loop is a control flow statement for\nspecifying iteration, which allows code to be\nexecuted repeatedly.This allows the body of the\nfor-loop (the code that is being repeatedly\nexecuted) to know about the sequencing of\neach iteration.";
	hint = "for(int i = 3; i <= n; i++)\n{\nc=a+b;\nSystem.out.println(c);\na=b;\nb=c;\n}\n";
	description = "Generate fibonacci series within the variable 'c'";
	FibonacciSeries obj = new FibonacciSeries();
 	ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		     String args[]=new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("enter the value of n:fibonacci series:\n0\n1\n1\n2\n3\n",outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

	


   }

    

