import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PronicNumberTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        PronicNumber obj = new PronicNumber();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void PronicNumber.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){
		assertEquals(0,1);
	}
    
        }
	@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
        PronicNumber obj = new PronicNumber();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{

		    String args[] = new String [0];
		    m.invoke(obj, (Object)args);
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
        description = "Take input in variable 'n'";
	PronicNumber obj = new PronicNumber();
	ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("enter a number:12\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "take a for loop which will iterate from i=1 to i<n";
	hint = "for(i=1;i<n;i++){}";
        description = "Start a for loop";
	PronicNumber obj = new 	PronicNumber();
	ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a number:1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n",outContent.toString().toLowerCase());	     
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "Take a if condition in which you will check if the product of two consecutive numbers is equal to the given number or not";
	hint="	if(i*(i+1)==n){}";
        description = "Take a if condition";
        PronicNumber obj = new PronicNumber ();
	ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                   assertEquals("enter a number:12\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "Copy the value of variable 'i' in 'c' so that you can print it later and then you will use break to go out of the loop as the two consecutive numbers are found ";
	hint = "c=i;\nbreak;";
        description = "Store the value of i into c";
	PronicNumber  obj = new PronicNumber ();
	ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a number:3\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.\n if statement is used to check that if the product of ith number and (i+1)th number is equal to the given number or not";
	hint = "if(c>0){System.out.println(\"It is a Pronic Number with these two consecutive factors: \"+c+\",\"+(c+1))}";
        description = "Check if i*(i+1) is equal to 'n' and print 'Pronic Number' with  2 consecutive numbers";
	PronicNumber  obj = new PronicNumber ();
	ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);	  
                  assertEquals("enter a number:it is a pronic number with these two consecutive factors: 3,4\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t8() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else{\nIt is not a Pronic Number\");\n}\n";
        description = "Print 'Not an Pronic Number' using else";
	PronicNumber  obj = new PronicNumber ();
	ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a number:it is not a pronic number\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
}
    	
        

 } 
