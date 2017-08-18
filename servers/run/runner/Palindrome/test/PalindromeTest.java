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
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
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
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Palindrome obj = new Palindrome();	
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
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
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
	instruction = "while loop is a control flow statement that\nallows code to be executed repeatedly based on\na given Boolean condition. The while loop can\nbe thought of as a repeating if statement.";
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
	instruction = "sum1 = (sum1*10)+r";
	hint = "sum=(sum*10)+r;\n";	
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
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(temp==sum)\nSystem.out.println(\"Palindrome\");\n";
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
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else{\nSystem.out.println(\"Not palindrome\");\n}\n ";
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



















    
