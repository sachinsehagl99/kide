import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class LargestSmallestStringTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        LargestSmallestString obj = new LargestSmallestString();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void LargestSmallestString.main(java.lang.String[]) throws java.io.IOException");
  

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
	LargestSmallestString obj = new LargestSmallestString();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{
		    String args[] = new String [0];
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
	instruction = "Take an string input in the variable a from the user.";
	hint = "a =br.readLine();\n";
        description = "Take input in variable 'a'";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
                 assertEquals("enter the sentence:\ncube\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }

  @Test
   public void t4() throws java.io.IOException{
	instruction = "String.charAt(i):Extracts a character from the i th position of the String.";
	hint = "c=a.charAt(i);\n";
        description = "Extracting each character";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
                 assertEquals("enter the sentence:\nc\nu\nb\ne\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }

 @Test
   public void t5() throws java.io.IOException{
	instruction = "String.substring(position1,position2):Extracts the word from the string from position1 to position2\nIf c is space then the substring function extracts the word before the space and the value of k is increased to the starting position of the next word.";
	hint = " if(c==' '){\n\ts=a.substring(k,i);\n k=i+1;\n}";
        description = "Extracting each word between the spaces.";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube Rose".getBytes());
	System.setIn(in);
	try {
		Method m = getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
                  assertEquals("enter the sentence:\ncube\nrose\n", outContent.toString().toLowerCase());		
    		}
        } catch(Exception e){ }
   }

   @Test
   public void t6() throws java.io.IOException{
	instruction = "string.length():returns the length of the input string\nuse string.length function to fin out the length of the string\ncopy the input string into another variable say sm=s.";
	hint = " small=s.length();\nsm=s;\n";
        description = "finding string length and copying the value to other string variable.";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube Rose".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
			System.err.println(outContent);
                 assertEquals("enter the sentence:\n4 cube\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
@Test
   public void t7() throws java.io.IOException{
	instruction = "string.length():returns the length of the input string\nuse string.length function to find out the length of the string\ncopy the input string into another variable say lm=s.";
	hint = " lar=s.length();\nlm=s;\n";
        description = "finding string length and copying the value to other string variable.";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube Rose".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
                 assertEquals("enter the sentence:\n4 cube\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
@Test
   public void t8() throws java.io.IOException{
	instruction = "Print the largest and the smallest word by using Sysytem.out.ptintln()function.";
	hint = "System.out.println(\"The largest word is: \"+lm);\nSystem.out.println(\"The smallest word is: \"+sm);"; 

        description = "Print the result.";
	LargestSmallestString obj = new LargestSmallestString();
	ByteArrayInputStream in = new ByteArrayInputStream("Cube Rose".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj,(Object)args);
                 assertEquals("enter the sentence:\nthe largest word is: cube\nthe smallest word is: cube\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }

}
