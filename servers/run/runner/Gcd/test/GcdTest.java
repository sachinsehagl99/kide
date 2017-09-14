import java.io.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class GcdTest extends Base
 {
	@Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Gcd obj = new Gcd();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Gcd.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Gcd obj = new Gcd();	
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
	instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	hint = "a = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'a'";
	Gcd obj = new Gcd();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("enter the first number:\n54\n", outContent.toString().toLowerCase());
		   
		   }
	   }
	   catch(Exception e){}
					
	}
 @Test
    public void t4() throws java.io.IOException{
	instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	hint = "b = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'b'";
	Gcd obj = new Gcd();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("enter the first number:\nenter the second number:\n24\n", outContent.toString().toLowerCase());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

	@Test
    public void t5() throws java.io.IOException{
	instruction = "While loop is a control flow statement that\nallows code to be executed repeatedly based on\na given Boolean condition.";
	hint = "r=a%b;\na=b;\nb=r;\n";
	description = "Within while-loop write code to get Gcd using division method";
	Gcd obj = new Gcd();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("enter the first number:\nenter the second number:\ngcd = 6", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}



}
