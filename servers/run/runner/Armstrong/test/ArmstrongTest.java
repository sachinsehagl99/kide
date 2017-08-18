import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ArmstrongTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Armstrong obj = new Armstrong();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Armstrong.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Armstrong obj = new Armstrong();	
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
        description = "Take input in variable 'a'";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                 assertEquals("Input the number:371\n",outContent.toString());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "dup=a;\n";
        description = "Put the value of 'a' in 'dup' variable";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "A do-while loop is a control flow statement\nthat executes a block of code at least once,\nand then repeatedly executes the block,or not,\ndepending on a given boolean condition at the\n end of the block.";
	hint = "b=a%10;\na=a/10;\n";
        description = "Extract the number within do-while loop";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                   assertEquals("Input the number:1\n7\n3\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "sum1 = sum1 + (x * x * x)";
	hint = "sum = sum + (b * b * b);\n";
        description = "Write necessary code for armstrong operation";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:1\n344\n371\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(sum == dup)\nSystem.out.println(\"Armstrong number\");\n";
        description = "Check if 'sum' is equal to 'dup' and print 'Armstrong number'";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("371".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:Armstrong number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t8() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else{\nSystem.out.println(\"Not an armstrong number\");\n}\n";
        description = "Print 'Not an armstrong number' using else";
	Armstrong obj = new Armstrong();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:Not an armstrong number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
}
    	
        

 } 
