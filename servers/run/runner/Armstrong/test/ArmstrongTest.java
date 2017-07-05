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
	hint = "BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Armstrong obj = new Armstrong();	
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
