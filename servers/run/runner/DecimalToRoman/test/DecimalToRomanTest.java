import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class DecimalToRomanTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        DecimalToRoman obj = new DecimalToRoman();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void DecimalToRoman.main(java.lang.String[]) throws java.io.IOException");
     

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
	DecimalToRoman obj = new DecimalToRoman();
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{

		   String args[] = new String[0];
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
	hint = "num=Integer.parseInt(br.readLine());\n";
        description = "Take input in variable 'num'";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number\n11\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
 @Test
   public void t4() throws java.io.IOException{
	instruction = "Roman Numbers Lies between 1-3999 check weather the no is valid or not\nby using if statment.";
	hint = "if(num>0||num<4000)\n{	\n\tSystem.out.println(\"The Roam Equivalent is Possible\");\n}\n";
        description = "Check if the number is in valid Range";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number:\nthe roman equivalent is possible\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
 @Test
   public void t5() throws java.io.IOException{
	instruction = "varriable1 = varraible - array[inedx]\n i.e to substract the nearest decimal number that is stored in array indexes from the original inputed decimal number\n";
	hint = "num = num - decimal[i];";
        description = "Substract the Nearest Decimal from the original from the Array\n";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number:\nthe roman equivalent is possible\n1\n0\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
 @Test
   public void t6() throws java.io.IOException{
	instruction = "varriable1 = varraible + array[inedx]\n i.e to add the equivalent Roman number to the String for the original decimal number\n";
	hint = "str = str + roman[i];";
        description = "Add the equivalent Roman Characters to the String\n";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number:\nthe roman equivalent is possible\nx\nxi\n",outContent.toString().toLowerCase());		
			 
     		
    		}

        }
	catch(Exception e){}
    	        }
 @Test
   public void t7() throws java.io.IOException{
	instruction = "Print the compiled string for the roman equivalent\n";
	hint = "System.out.println(\"Roman Equivalent = \"+str);";
        description = "Print the Roman Equivalent\n";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		 String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number:\nthe roman equivalent is possible\nroman equivalent = xi\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
 @Test
   public void t8() throws java.io.IOException{
	instruction = "else \n Statement to print that it is a invalid decimal number to find its roman equivalent\n";
	hint = "else \n System.out.println(\"Invalid Number\");";
        description = "Else Part to state that it is a Invalid Number\n";
	DecimalToRoman obj = new DecimalToRoman();
	ByteArrayInputStream in = new ByteArrayInputStream("4001".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String[0];
		    m.invoke(obj,(Object)args);
                 assertEquals("enter a number:\ninvalid number\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
}
