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
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Extract obj = new Extract();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Extract.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }

	@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Extract obj = new Extract();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{
		    String args[]=new String[0];
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
	hint = "a = Integer.parseInt(br.readLine());\n";
	description = "Take input in variable 'a'";
	Extract obj = new Extract();
 	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 
 	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
<<<<<<< HEAD
		    m.invoke(obj);
=======
		    String args[]=new String[0];
		    m.invoke(obj,(Object)args);
>>>>>>> 2a47ed30857d7852e5457f489d903df1767a501b
		    assertEquals("enter a three digit number:\n134\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}


	@Test
    public void t4() throws java.io.IOException{
	instruction = "d = b%10\nb=b/10";
	hint = "r=a%10;\na=a/10;\n";
	description = "Extract ones position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
<<<<<<< HEAD
		    m.invoke(obj);
=======
		    String args[]=new String[0];
		    m.invoke(obj,(Object)args);
>>>>>>> 2a47ed30857d7852e5457f489d903df1767a501b
		    assertEquals("enter a three digit number:\nones position:4\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
     public void t5() throws java.io.IOException{
	instruction = "d = b%10\nb=b/10";
	hint = "r=a%10;\na=a/10;\n";	
	description = "Extract tens position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
<<<<<<< HEAD
		    m.invoke(obj);
		    assertEquals("enter a three digit number:\nones position:4\ntens position:3\n", outContent.toString().toLowerCase());
=======
		    String args[]=new String[0];
		    m.invoke(obj,(Object)args);
		    assertEquals("enter a three digit number:\nones position:4\ntens position:3\n",outContent.toString().toLowerCase());
>>>>>>> 2a47ed30857d7852e5457f489d903df1767a501b
	   	}
	   }
	   catch(Exception e){}
					
	}

		@Test
   public void t6() throws java.io.IOException{
	instruction = "d = b%10\nb=b/10";
	hint ="r=a%10;\na=a/10;\n";	
	description = "Extract hundreds position value";
	Extract obj = new Extract();
	ByteArrayInputStream in = new ByteArrayInputStream("134".getBytes());
	System.setIn(in); 

  	try {
	
	   	Method m = getMethod(obj,"main");
	   	if(m!=null)
		{
<<<<<<< HEAD
		    m.invoke(obj);
=======
		    String args[]=new String[0];
		    m.invoke(obj,(Object)args);
>>>>>>> 2a47ed30857d7852e5457f489d903df1767a501b
		    assertEquals("enter a three digit number:\nones position:4\ntens position:3\nhundreds position:1\n", outContent.toString().toLowerCase());
	   	}
	   }
	   catch(Exception e){}
					
	}

	
 }
