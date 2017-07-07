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
		    assertEquals("Input a string:madam\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t4() throws java.io.IOException{
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
		    assertEquals("Input a string:madam\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t5() throws java.io.IOException{
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
		    assertEquals("Input a string:Palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
	public void t6() throws java.io.IOException{
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
		    assertEquals("Input a string:Not palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
	

    }

