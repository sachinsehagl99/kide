import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class PigLatinTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        PigLatin obj = new PigLatin();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void PigLatin.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){assertEquals(1, 0);

}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	PigLatin obj = new PigLatin();	
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
	instruction = "We take a word which we want to convert to piglatin word and store it in string 's'.";
	hint = "System.out.println(\"Enter the word:\");\ns=br.readLine();\n";
        description = "Take a word as input";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\npig\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t4() throws java.io.IOException{
	instruction = "The method toLowerCase() converts the characters of a String into lower case characters and stores it in string s";
	hint = "s=s.toLowerCase();\n";
        description = "Convert the string to lower case";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                   assertEquals("enter the word:\npig\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }
	@Test
	public void t5() throws java.io.IOException{
	instruction = "s.length()-This method returns the length of the string 's'(number of characters in String)";
	hint = "l=s.length();\n";
        description = "Find the length of the string.";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\n3\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t6() throws java.io.IOException{
	instruction = "for loop executes a sequence of statements multiple times and tests the condition before executing the loop body.\n";
	hint = "for(i=0;i<l;i++)\n{\n}\n";
        description = "A for loop to scan the characters of the string.";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\n0\n1\n2\n",outContent.toString().toLowerCase());		
 
     		
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
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\np\ni\ng\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

@Test
	public void t8() throws java.io.IOException{
	instruction = "if-else statement in java. An if statement can be followed by an optional else statement, which executes when the Boolean expression is false.Here we are using the if statement to check whether the extracted character is a vowel or not.\n";
	hint = "if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')\n{\n}\n";
        description = "Check if the character is a vowel or not.";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\ni\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

    	@Test
	public void t9() throws java.io.IOException{
	instruction = "When break statement in java is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.\n";
	hint = "break;\n";
        description = "Break the loop on getting a vowel.";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter the word:\ni\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

     	@Test
	public void t10() throws java.io.IOException{
	instruction = "String substring(int beginIndex, int endIndex): Returns the substring starting from the given index(beginIndex) till the specified index(endIndex). For e.g. \"PigLatin\".substring(2,5) would return \"gLa\"\n Here 's.substring(i,l)'- returns the part after the vowel\n 's.substring(0,i)'-returns the part before the vowel\n and 'ay' is added to form the piglatin word.\n ";
	hint = "str=s.substring(i,l)+s.substring(0,i)+\"ay\";\nSystem.out.println(str);\n";
        description = "Store the piglatin word in string 'str' ";
	PigLatin obj = new PigLatin();
	ByteArrayInputStream in = new ByteArrayInputStream("pig".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
		 assertEquals("enter the word:\nigpay\nigpay\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){assertEquals(1, 0);
}
}

       

 } 

