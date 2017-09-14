import java.io.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import java.lang.reflect.*;

public class HelloWorldTest extends Base
 {

   @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        HelloWorld obj = new HelloWorld();
	try {
		Method m=getMethod(obj,"main");
		String args[] = new String [0];
		m.invoke(obj,(Object)args);
		String m1=m.toString();
	        assertEquals(m1, "public static void HelloWorld.main(java.lang.String[]) throws java.io.IOException");
    		} catch(Exception e){} 
    }

    @Test
   public void t2() throws java.io.IOException{
	instruction = "System: It is a class in the java.lang package.\n\nout: It is a static member of the System\nclass, and is an instance of java.io.PrintStream.\n\nprintln: It is a method of java.io.PrintStream.\nThis method is overloaded to print message to\noutput destination, which is typically a\nconsole or file.";
	hint = "System.out.println(\"Hello World\");\n";
        description = "Print 'Hello World'";
	HelloWorld obj = new HelloWorld();
	  try {
		Method m = getMethod(obj,"main");
                
		if(m!= null) {
		  String args[] = new String[0];
		  m.invoke(obj,(Object)args);
	          assertEquals("hello world\n", outContent.toString().toLowerCase());
    		}
          } catch(Exception e){} 
        } 
 }


    

