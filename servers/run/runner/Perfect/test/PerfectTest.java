import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PerfectTest extends Base
 {
@Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Perfect obj = new Perfect();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Perfect.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Perfect obj = new Perfect();	
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
	hint = "n=Integer.parseInt(br.readLine());\n";
	description = "Take a input in variable 'n'";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:28\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t4() throws java.io.IOException{
	instruction = "A for-loop is a control flow statement for\nspecifying iteration, which allows code to be\nexecuted repeatedly.This allows the body of the\nfor-loop (the code that is being repeatedly\nexecuted) to know about the sequencing of\neach iteration.\n\nAn if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(n % i == 0)\n{\nsum = sum + i;\n}\n";
	description = "Within for check if 'n' is divisible by i ,then add 'i' and store it in variable 'sum' ";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n3\n6\n6\n6\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
		@Test
	public void t5() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(sum == n)\n{\nSystem.out.println(\"Perfect\");\n}\n";
	description = "Check if the 'sum' is equal to 'n' and print 'Perfect'";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Perfect\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t6() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else\n{\nSystem.out.println(\"Not Perfect\");\n}\n";
	description = "Print Not Perfect using else";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Not Perfect\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}



 }

