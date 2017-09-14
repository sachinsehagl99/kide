import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class DisariumTest extends Base
 {
     @Test
   public void t1() throws java.io.IOException{
	instruction = "public : its the access specifier means\nfrom every where we can access it.\n\nstatic : access modifier means we can call\nthis method directly using class name\nwithout creating an object of it.\n\nvoid : it is a return type i.e it does\nnot return any value.\n\nmain() : it is a method name.\n\nstring args[] : its a command line argument\nit is a collection of variables in the string\nformat.\n";
	
	hint = "public static void main(String args[]) throws IOException {\n \n}";
	description = "Create a main method";
        Disarium obj = new Disarium();
	try {
		Method m=getMethod(obj,"main");
		String m1=m.toString();
	        assertEquals(m1,"public static void Disarium.main(java.lang.String[]) throws java.io.IOException");
     

    		}
        
	catch(Exception e){}
    
        }
    @Test
    public void t2() throws java.io.IOException{
		instruction = "br : Object of BufferedReader class.\n\nInputStreamReader: InputStreamReader is a\nsubclass of Reader class. It converts bytes\nto character.\n\nSystem.in: Console inputs are read from this.";

	hint = "br = new BufferedReader(new InputStreamReader(System.in));\n";
	description = "Use 'BufferedReader' to read input from user";
	Disarium obj = new Disarium();	
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
	hint = "a=Integer.parseInt(br.readLine());\n";
        description = "Take input in variable 'a'";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                 assertEquals("input the number:135\n",outContent.toString().toLowerCase());		
			 
     		
    		}
        }
	catch(Exception e){}
    	        }
	@Test
	public void t4() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "dup=a;\n";
        description = "Put the value of 'a' in 'dup' variable";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:135\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }

	@Test
	public void t5() throws java.io.IOException{
	instruction = "A do-while loop is a control flow statement\nthat executes a block of code at least once,\nand then repeatedly executes the block,or not,\ndepending on a given boolean condition at the\n end of the block.";
	hint = "b=a%10;\na=a/10;\n";
        description = "Extract the number within do-while loop";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   String args[] = new String [0];
		   m.invoke(obj, (Object)args);
                   assertEquals("input the number:5\n3\n1\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }
	@Test
	public void t6() throws java.io.IOException{
	instruction = "variable++ in expanded form is represented as variable = varriable + 1";
	hint = "i++;\n";
        description = "Increment the counter varriable";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:1\n2\n3\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,1);	
	}
    	    
        }

	@Test
	public void t7() throws java.io.IOException{
	instruction = "Exchange the value between two variable\nStore the value of 'c' into another variable\n'b'. Ex: b=c;";
	hint = "a=dup;\n";
        description = "Put the value of 'dup' in 'a' variable";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:135\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }


	@Test
	public void t8() throws java.io.IOException{
	instruction = "A do-while loop is a control flow statement\nthat executes a block of code at least once,\nand then repeatedly executes the block,or not,\ndepending on a given boolean condition at the\n end of the block.";
	hint = "b=a%10;\na=a/10;\n";
        description = "Extract the number within do-while loop";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:5\n3\n1\n",outContent.toString().toLowerCase());		
		    // assertEquals(0,1); 
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,0);	
	}
    	    
        }

	
	@Test
	public void t9() throws java.io.IOException{
	instruction = "final value of variable = initial value of variable + Power Function of Math Class(variavle ^ index)";
	hint = "dis = dis + Math.pow(b,i);\n";
        description = "Find the cummulative sum of the varriable to the power its index";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:125.0\n134.0\n135.0\n",outContent.toString().toLowerCase());		
 		   //assertEquals(0,1);
     		
    		}
        }
	catch(Exception e){
		//assertEquals(0,0);	
	}
	}

	@Test
	public void t10() throws java.io.IOException{
	instruction = "variable-- in the expanded form is represented as varriable = variable - 1 ";
	hint = "i--;\n";
        description = "Decrement the counter varriable";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:2\n1\n0\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
    	    
        }


	@Test
	public void t11() throws java.io.IOException{
	instruction = "An if statement can be followed by an\noptional else statement, if executes when\nthe Boolean expression is true.";
	hint = "if(dup == dis )\nSystem.out.println(\"Disarium Number\");\n";
        description = "Print 'Disarium number' using if";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("135".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:disarium number\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
	}

	@Test
	public void t12() throws java.io.IOException{
	instruction = "else statement executes when the Boolean\nexpression is false";
	hint = "else \nSystem.out.println(\"Not a Disarium Number\");\n";
        description = "Print 'Not an armstrong number' using else";
	Disarium obj = new Disarium();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		  String args[] = new String [0];
		  m.invoke(obj, (Object)args);
                  assertEquals("input the number:not a disarium number\n",outContent.toString().toLowerCase());		
 
     		
    		}
        }
	catch(Exception e){}
	}

 } 
