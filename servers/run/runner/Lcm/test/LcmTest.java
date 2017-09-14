import java.io.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class LcmTest extends Base
 {
	@Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Lcm obj = new Lcm();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Lcm.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Lcm obj = new Lcm();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{

		    String args[] = new String[0];
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
	hint = "a = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'a'";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\n54\n", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}
 @Test
    public void t4() throws java.io.IOException{
	instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	hint = "b = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'b'";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\nEnter the second number:\n24\n", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

@Test
    public void t5() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "x = a;\n";
	description = "Put the value of 'a' in 'x' variable";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\nEnter the second number:\n54\n", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

@Test
    public void t6() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "y = b;\n";
	description = "Put the value of 'b' in 'y' variable";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());		
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\nEnter the second number:\n24\n", outContent.toString());
		   
		   }
	   }
	   catch(Exception e){}
					
	}

	@Test
    public void t7() throws java.io.IOException{
	instruction = "r1 = x1%y1\nx1 = y1\ny1 = r1";
	hint = "r=x%y;\nx=y;\ny=r;\n";
	description = "Write code to get Gcd using division method and print the value of 'x'";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\nEnter the second number:\n6\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
    public void t8() throws java.io.IOException{
	instruction = "l1 = (a1*b1)/x";
	hint = "l = (a*b)/x;\n";
	description = "Write code to get LCM";
	Lcm obj = new Lcm();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("54").then("24").atSomePoint());

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter the first number:\nEnter the second number:\n6\nLCM:216", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}



}
