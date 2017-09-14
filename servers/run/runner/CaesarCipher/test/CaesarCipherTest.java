import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class CaesarCipherTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        CaesarCipher obj = new CaesarCipher();
	try {
		Method m=getMethod(obj,"main");
		System.err.println(m);
		String m1=m.toString();
	        assertEquals(m1,"public static void CaesarCipher.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){assertEquals(1, 0);
}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	CaesarCipher obj = new CaesarCipher();	
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
	instruction = "Here br.readline() method is used to read a line of text which is given as an input by the user.";
	hint = "s=br.readLine();\n";
        description = "Take input in variable 's'";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").atSomePoint());			
   try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("enter the string to be encrypted:\nabcxyz\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "Integer.parseInt() method parses the string\nargument as a integer";
	hint = "n=Integer.parseInt(br.readLine());\n";
        description = "Take input in variable 'n'";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());	
    try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\n5\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "The method toLowerCase() converts the characters of a String into lower case characters.Here we are converting the string 's' into lower case and again storing it in 's'.";
	hint = "s=s.toLowerCase();\n";
        description = "Convert string s to lower case.";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                   assertEquals("enter the string to be encrypted:\nenter the shift value:\nabcxyz\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "For loop executes a sequence of statements multiple times and tests the condition before executing the loop body.\n ";
	hint = "for(i=0;i<s.length();i++)\n{\n}\n";
        description = "A for loop to scan the characters of the string. ";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\n0\n1\n2\n3\n4\n5\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
	instruction = "The method charAt(int index) returns the character at the specified index.\n Here we extract the characters of the string 's' and store it in variable 'c'";
	hint = "c=s.charAt(i);\n";
        description = "Extract the characters of the string.";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());		
    try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\na\nb\nc\nx\ny\nz\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t8() throws java.io.IOException{
	instruction = "Here we are adding the shift value to the variable'c' so that it gets shifted with the desired value and then we explicitly convert the value to char datatype";
	hint = "c=(char)(c+n);\n";
        description = "Add the shift value to the character 'c'.";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("3").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
		  assertEquals("enter the string to be encrypted:\nenter the shift value:\nd\ne\nf\n{\n|\n}\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

    	
      
	@Test
	public void t9() throws java.io.IOException{
	instruction = "The if statement checks whether the condition is true or not and on the basis of that executes instructions";
	hint = "if(c>'z')\n{\n}\n";
        description = "Check if the character is a valid alphabet";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("3").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\n{\n|\n}\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
} 

	@Test
	public void t10() throws java.io.IOException{
	instruction = "If the character is out of range (exceeds english alphabets) then it is circularly adjusted to start shifting from starting of the alphabet";
	hint = "c=(char)(c-26);\n";
        description = "Subtract 26 in order to move to start of alphabet";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args); 
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\nc\nd\ne\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

	@Test
	public void t11() throws java.io.IOException{
	instruction = "The character is encrypted and added to form the final encrypted string";
	hint = "str=str+c;\n";
        description = "Add encrypted character to new string";
	CaesarCipher obj = new CaesarCipher();
	System.setIn(StubbedInputStream.stubInputStream().toReturn("abcxyz").then("5").atSomePoint());	
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the string to be encrypted:\nenter the shift value:\nf\nfg\nfgh\nfghc\nfghcd\nfghcde\nthe final string:fghcde\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
} 

 } 

