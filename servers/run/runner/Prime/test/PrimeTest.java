import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class PrimeTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Prime obj = new Prime();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Prime.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Prime obj = new Prime();	
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
	public void t3() throws java.io.IOException 
	{
	   instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	   hint = "a = Integer.parseInt(br.readLine());\n";
	   description = "Take a input in variable 'a'";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number:3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
		
@Test
	public void t4() throws java.io.IOException 
	{
	   instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.\n\nflag: It is a variable you can use to\ncontrol the flow of a function or statement,\nallowing you to check for certain conditions while\nyour function progresses.";
	   hint = "if(a % i == 0)\n{\nflag ++;\n}\n";
	   description = "Check if 'a' is divisible by 'i' and increment variable 'flag' by 1";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number:1\n2\n2\n2\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	
	@Test
	public void t5() throws java.io.IOException 
	{
	   instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	   hint = "if(flag == 0)\n{\nSystem.out.println(\"Prime\");\n}\n";
	   description = "Check if 'flag' is equal to '0' and print 'Prime'";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number:Prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }

	@Test
	public void t6() throws java.io.IOException 
	{
	   instruction = "else statement executes when the Boolean\nexpression is false";
	   hint = "else\n{\nSystem.out.println(\"Not Prime\");\n}\n";
	   description = "Print 'Not Prime' using else";
	   Prime obj = new Prime();
	   ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
	   System.setIn(in); 
	   try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Input a number:Not Prime\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
	 
        }
	
	
}




