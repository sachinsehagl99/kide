import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class RemoveConseCharTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        RemoveConseChar obj = new RemoveConseChar();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void RemoveConseChar.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){  assertEquals(1, 0);
}
    
        }
@Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	RemoveConseChar obj = new RemoveConseChar();	
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
	instruction = "'ch'-to store the characters\n'i'-to run the for loop\n'l'-to store the length of the string\n'newStr'- To store the new string after deletion of duplicate consecutive characters";
	hint = "char ch;\nint i,l;\nString newStr=\"\";\n";
        description = "Initialise the variables";
	RemoveConseChar obj = new RemoveConseChar();
		try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String [0];
		 m.invoke(obj, (Object)args);
                 assertEquals("\n", outContent.toString().toLowerCase());		
	
			 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "we take the word from which the consecutive characters are to be removed and store it in variable 's'\n'b'. Ex: b=c;";
	hint = "System.out.println(\"Enter a word:\");\nString s=br.readLine();\n";
        description = "Take a word as input";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nqqwweerrttyy\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "The function s.length() returns count of total number of characters. The length of java string is same as the unicode code units of the string.";
	hint = "l=s.length();\n";
        description = "To find out the length of a given string;\n";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                   assertEquals("enter a word:\n12\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.";
	hint = "for(i=0;i<l-1;i++)\n{\n}\n";
        description = "For loop to access each character.";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
	instruction = "The method charAt(int index) returns the character at the specified index. The index value should lie between 0 and length()-1. ";
	hint = "ch=s.charAt(i);\n";
        description = "It extracts the character at position 'i' andf stores it in variable 'ch'.";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nq\nq\nw\nw\ne\ne\nr\nr\nt\nt\ny\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
    	    
        }

	@Test
	public void t8() throws java.io.IOException{
	instruction = "An if-else statement in java is used to check a condition. An if statement can be followed by an optional else statement, which executes when the Boolean expression is false.";
	hint = "if(ch!=s.charAt(i+1))\n{\n}\n";
        description = "Check whether the consecutive charactqqers are not equal";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nw\ne\nr\nt\ny\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
}
    
	@Test
	public void t9() throws java.io.IOException{
	instruction = "when two characters in given word are not equal then it is added in 'newStr'";
	hint = "newStr=newStr+ch;\n";
        description = "Forming a new string by adding a character.";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nq\nqw\nqwe\nqwer\nqwert\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
}
	
     	@Test
	public void t10() throws java.io.IOException{
	instruction = "As the last character is left out during the loop so it needs to be explicitly added to the new string.";
	hint = "newStr=newStr+ s.charAt(l-1);\n";
        description = "Add the last character to the string";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nqwerty\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}
}
	   
     	@Test
	public void t11() throws java.io.IOException{
	instruction = "For printing the final string after the removal consecutive duplicate characters.";
	hint = "System.out.println(newStr);\n";
        description = "Print the final string.";
	RemoveConseChar obj = new RemoveConseChar();
	ByteArrayInputStream in = new ByteArrayInputStream("qqwweerrttyy".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("enter a word:\nqwerty\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){ assertEquals(1, 0);
}

}
	
 } 

