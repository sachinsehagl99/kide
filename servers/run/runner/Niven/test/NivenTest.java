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
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Niven obj = new Niven();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Niven.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	hint = "BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Niven obj = new Niven();	
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
	hint = "n=Integer.parseInt(br.readLine());\n";
	description = "Take input in variable n";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:111\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
	public void t4() throws java.io.IOException{
	hint = "c = n;\n";
	description = "Put the value of 'n' in 'c' variable";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:111\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}
@Test
	public void t5() throws java.io.IOException{
	hint = "d = c%10;\nsum = sum + d;\nc = c/10;\n";
	description = "Write necessary code within while-loop";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:1\n2\n3\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t6() throws java.io.IOException{
	hint = "if(n%sum == 0)\nSystem.out.println(\"Niven Number\");\n";
	description = "Check if 'n%sum' equal to 0 and print 'Niven Number' ";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("111".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Niven Number\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}

@Test
	public void t7() throws java.io.IOException{
	hint = "else{\nSystem.out.println(\"Not a Niven Number\");\n}\n";
	description = "Print 'Not a Niven Number' using else";
	Niven obj = new Niven();
 	ByteArrayInputStream in = new ByteArrayInputStream("28".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
		    m.invoke(obj);
		    assertEquals("Enter a number:Not a Niven Number\n", outContent.toString());
	   	}
	   }
	   catch(Exception e){}
					
	}


   }

