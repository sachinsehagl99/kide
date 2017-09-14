import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;


public class PalindromeStringTest extends Base {
	
	@Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        PalindromeString obj = new PalindromeString();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void PalindromeString.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	PalindromeString obj = new PalindromeString();	
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
	instruction = "br.readline() method read a line of text. ";
	hint = "a= br.readLine();\n";
	description = "Take input in string 'a'";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("input a string:madam\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t4() throws java.io.IOException{
	instruction = "StringBuffer(): creates an empty string buffer with the\ninitial capacity of 16.\n\nreverse(): This method returns the reversed object\non which it was called.\n\ntoString(): It is a method used to create String\nrepresentation of an object. Since every class\nin Java is a sub-class of Object and\nObject has toString() method, every class has\na default toString() method.";
	hint = "b=new StringBuffer(a).reverse().toString();\n";
	description = "Put the reverse value of string 'a' in string 'b'";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("input a string:madam\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t5() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(a.equals(b))\n{\nSystem.out.println(\"Palindrome\");\n}\n";
	description = "Check if a is equal to b and print 'Palindrome'";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("input a string:palindrome\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
	public void t6() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else\n{\nSystem.out.println(\"Not palindrome\");\n}\n";
	description = "Print 'Not palindrome' using else";
	PalindromeString obj = new PalindromeString();
 	ByteArrayInputStream in = new ByteArrayInputStream("aloka".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("input a string:not palindrome\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
	

    }

