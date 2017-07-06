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
	hint = "if(n % i == 0)\n{\nsum = sum + i;\n";
	description = "Within for check if  'n%i' is equalto 0 and write necessary code to get 'sum'";
	Perfect obj = new Perfect();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n3\n7\n14\n28\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
	
		@Test
	public void t5() throws java.io.IOException{
	hint = "if(sum == n)\n{\nSystem.out.println(\"Number is Perfect\");\n}\n";
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
	hint = "else\n{\nSystem.out.println(\"Number is not Perfect\");\n}\n";
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

