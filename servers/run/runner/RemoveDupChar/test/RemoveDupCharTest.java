import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class RemoveDupCharTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        RemoveDupChar obj = new RemoveDupChar();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void RemoveDupChar.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	RemoveDupChar obj = new RemoveDupChar();	
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
	instruction = "br.readLine() method read a line of text.";
	hint = "s=br.readLine();\n";
        description = "Take input in variable 's'";
	RemoveDupChar obj = new RemoveDupChar();
	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("enter a word:madam\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
@Test
   public void t4() throws java.io.IOException{
	instruction = "s.length():finds the length of the string and store in the integer variable";
	hint = "l = s.length();";
        description = "Find the String length";
	RemoveDupChar obj = new RemoveDupChar();
	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("enter a word:5\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
	}
   @Test
   public void t5() throws java.io.IOException{
	instruction = "s.char(i):Extract each character from the input String\n check if the extracted character is a blank space or not\n if there is a blank space don't add it to the new string if its not a blank space add the character to the string\ns.replace(ch,m):replaces the character 'ch' in the string with the character 'm'";
	hint = "ch = s.charAt(i);\nif(ch!=' ')\nans = ans + ch;\ns = s.replace(ch,' ');\n";
        description = "Write the code to remove the duplicate character";
	RemoveDupChar obj = new RemoveDupChar();
	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("enter a word:mad\nafter removing duplicate characters:mad\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }


}
