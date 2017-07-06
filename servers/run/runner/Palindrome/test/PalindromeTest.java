import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PalindromeTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Palindrome obj = new Palindrome();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Palindrome.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Palindrome obj = new Palindrome();	
	 try {
	
		   Method m = getMethod(obj,"main");
		   if(m!=null)
		{
		    m.invoke(obj);
		    String abc = (outContent.toString()).substring(0, (outContent.toString()).indexOf("@"));
		    assertEquals("java.io.BufferedReader", abc);
		   
		   }
	   }
	   catch(Exception e){}
					
	}



	@Test
	public void t3() throws java.io.IOException{
	hint = "a=Integer.parseInt(br.readLine());\n";
	description = "Take a input in variable 'a'";
	Palindrome obj = new Palindrome();
 	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:121\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t4() throws java.io.IOException{
	hint = "temp=a;\n";
	description = "Put the value of 'a' in 'temp' variable";
	Palindrome obj = new Palindrome();
 	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:121\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t5() throws java.io.IOException{
	hint = "r=a%10;\na=a/10;\n";
	description = "Start a while-loop and write necessary code to extract the number";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n2\n1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
	public void t6() throws java.io.IOException{
		description = "Within while-loop write necessary code to get sum of the numbers";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n12\n121\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	@Test
	public void t7() throws java.io.IOException{
	hint = "if(temp==sum)\nSystem.out.println(\"palindrome\");\n";
	description = "Check if 'temp' is equal to 'sum' and print 'Palindrome'";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t8() throws java.io.IOException{
	hint = "else{\nSystem.out.println(\"not palindrome\");\n}\n ";
	description = "Print 'Not palindrome' using else";
	Palindrome obj = new Palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Not palindrome\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


}



















    
