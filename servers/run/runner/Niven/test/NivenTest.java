import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class NivenTest extends Base
 {

 @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Niven obj = new Niven();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Niven.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Niven obj = new Niven();	
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
	hint = "n=Integer.parseInt(br.readLine());\n";
	description = "Take input in variable n";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter a number:111\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
	public void t4() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=a;";
	hint = "c = n;\n";
	description = "Put the value of 'n' in 'c' variable";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter a number:111\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
@Test
	public void t5() throws java.io.IOException{
        instruction = "while loop is a control flow statement that\nallows code to be executed repeatedly based on\na given Boolean condition. The while loop can\nbe thought of as a repeating if statement.";
	hint = "d = c%10;\nsum = sum + d;\nc = c/10;\n";
	description = "Add the sum of the digits";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter a number:1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t6() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(n%sum == 0)\nSystem.out.println(\"Niven Number\");\n";
	description = "Check if 'n' is divisible by 'sum' and print 'Niven Number' ";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter a number:Niven Number\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t7() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else{\nSystem.out.println(\"Not a Niven Number\");\n}\n";
	description = "Print 'Not a Niven Number' using else";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    String args[] = new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("Enter a number:Not a Niven Number\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


   }

