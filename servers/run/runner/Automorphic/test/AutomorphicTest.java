import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class AutomorphicTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	
	hint = "public static void main() throws IOException {\n \n}";
	description = "Create a main method";
        Automorphic obj = new Automorphic();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Automorphic.main() throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
    @Test
    public void t2() throws java.io.IOException{
	instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";
	
	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Automorphic obj = new Automorphic();	
	 try {
	
		   Method m = getMethod(obj, "main");
		   if(m!=null)
		{

		    m.invoke(obj);
                    Object br = Base.getDebuggingObject();
		    assertEquals("java.io.BufferedReader", br.getClass().getName());
	 	     //assertEquals(0,0);	   
		   }
	   } catch(Exception e){
             assertEquals(1, 0);
           }
	}


   @Test
   public void t3() throws java.io.IOException{
	instruction = "Integer.parseInt() method parses the string\nargument as a integer.";
	
	hint = "a=Integer.parseInt(br.readLine());\n";
        description = "Take input in variable 'a'";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                 assertEquals("Input the number:76\n",outContent.toString());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "dup=a;\n";
        description = "Put the value of 'a' in 'dup' variable";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:76\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "A do-while loop is a control flow statement\nthat executes a block of code at least once,\nand then repeatedly executes the block,or not,\ndepending on a given boolean condition at the\n end of the block.";
	
	hint = "b=a%10;\na=a/10;\n";
        description = "Extract the number within do-while loop";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                   assertEquals("Input the number:6\n7\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "variable++ in expanded form is represented as variable = varriable + 1";
	hint = "i++;\n";
        description = "Increment the counter varriable";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:1\n2\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){
		assertEquals(0,1);	
	}
    	    
        }


	@Test
	public void t7() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	
	hint = "a=dup;\n";
        description = "Put the value of 'dup' in 'a' variable";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:76\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	
	@Test
	public void t8() throws java.io.IOException{
	instruction = "variable = variable * variable represents performing the square of a number and saving it in the same variable";
	hint = "a= a *a ;\n";
        description = "Find the square of the value of 'a'";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:5776\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	


	@Test
	public void t9() throws java.io.IOException{
	instruction = "A do-while loop is a control flow statement\nthat executes a block of code at least once,\nand then repeatedly executes the block,or not,\ndepending on a given boolean condition at the\n end of the block.";
	hint = "b=a%10;\na=a/10;\n";
        description = "Extract the number within do-while loop";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:6\n7\n",outContent.toString());		
		    // assertEquals(0,1); 
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,0);	
	}
    	    
        }

	
	@Test
	public void t10() throws java.io.IOException{
	instruction = "final value of varriable1 = (varriable2 * varriable3)+ initial value of variable1";
	hint = "auto = (b*j) + auto;\n";
        description = "Write the equation so that the extracted digits form a number in reverse order";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:6\n13\n",outContent.toString());		
 		   //assertEquals(0,1);
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,0);	
	}
	}

	@Test
	public void t11() throws java.io.IOException{
	instruction = "Saving a numerical value in a variable";
	hint = "j = 10; \n";
        description = "Set the value of j as 10 so that on 2nd iteration the value becomes a multiple of 10";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:6\n76\n",outContent.toString());		
 		   //assertEquals(0,1);
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,0);	
	}
	}


	@Test
	public void t12() throws java.io.IOException{
	instruction = "variable-- in the expanded form is represented as varriable = variable - 1 ";
	hint = "i--;\n";
        description = "Decrement the counter varriable";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:1\n0\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }


	@Test
	public void t13() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	
	hint = "if(dup == auto )\nSystem.out.println(\"Automorphic Number\");\n";
        description = "Print 'Automorphic Number' using if";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("76".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:Automorphic Number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
	}

	@Test
	public void t14() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else \nSystem.out.println(\"Not an Automorphic Number\");\n";
        description = "Print 'Not an Automorphic number' using else";
	Automorphic obj = new Automorphic();
	ByteArrayInputStream in = new ByteArrayInputStream("89".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  m.invoke(obj);
                  assertEquals("Input the number:Not an Automorphic Number\n",outContent.toString());		
 
     		
    		}
        }
	catch(Exception e){}
	}

 } 
