import java.io.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class ExtractTest extends Base
 {
	 @Test
   public void t1() throws java.io.IOException{
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Extract obj = new Extract();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Extract.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Extract obj = new Extract();	
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
	hint = "a = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'a'";
	Extract obj = new Extract();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\n134\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t4() throws java.io.IOException{
	hint = "r=a%10;\na=a/10;\n";
	description = "Extract ones position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
     public void t5() throws java.io.IOException{
	hint = "r=a%10;\na=a/10;\n";	
	description = "Extract tens position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\nTens position:3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
   public void t6() throws java.io.IOException{
	hint ="r=a%10;\na=a/10;\n";	
	description = "Extract hundreds position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a three digit number:\nOnes position:4\nTens position:3\nHundreds position:1\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

	
 }
