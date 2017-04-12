import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class palindromeTest extends Base
 {

    @Test
    public void t1() {
       description = "Find the reverse of the number using function 'rev'";
      int a=121;
      int b = 0;
      palindrome obj = new palindrome();
      try {
	Method m=getMethod(obj,"rev");
		if(m!=null)
		{
			b = Integer.parseInt(m.invoke(obj, a).toString());
    			assertEquals(121, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
    public void t2() {
       description = "Check between the reversed number and the original a function named 'check'";
      palindrome obj = new palindrome();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 121,121).toString());
    			assertEquals(1, b);
        	}
        }
	catch(Exception e){}
     }


    @Test
    public void t3() {
      description = "Check between the reversed number and the original a function named 'check'";
      palindrome obj = new palindrome();
      try {
	Method m=getMethod(obj,"check");
		if(m!=null)
		{
		       int b = Integer.parseInt(m.invoke(obj, 123,321).toString());
    			assertEquals(0, b);
        	}
        }
	catch(Exception e){}
     }

    @Test
   public void t4() throws java.io.IOException{
       description = "call the main fucntion";
	palindrome obj = new palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\npalindrome\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }

   @Test
   public void t5() throws java.io.IOException{
        description = "call the main fucntion";
	palindrome obj = new palindrome();
	ByteArrayInputStream in = new ByteArrayInputStream("123".getBytes());
	System.setIn(in);
	try {
		Method m=getMethod(obj,"main");
		if(m!=null)
		{
		   m.invoke(obj);
		   assertEquals("input a number\nnot palindrome\n", outContent.toString());
     

    		}
        }
	catch(Exception e){}
    
        }
}

