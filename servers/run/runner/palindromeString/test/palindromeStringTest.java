import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;

public class palindromeStringTest extends Base {

    @Test
    public void t1() {
      description = "ok, lets create a function that will take a string parameter and return the reverse";
      String  a="Madam";

String b = "";
      palindromeString obj = new palindromeString();
      try {
        //Method m = obj.getClass().getMethod("rev");
//        Object b = m.invoke(obj, a);
//
Method[] methods = obj.getClass().getMethods();
for (Method m : methods) {
  //System.out.println(m.getName());
  if (m.getName().equals("rev")) {
    b = m.invoke(obj, a).toString();
    //hasMethod = true;
    break;
  }
}
        assertEquals("madaM", b);
      } catch (Exception e){
        assertEquals(0, 1);
      }
    }

/*    @Test
    public void t2() {
      description = "2.this should check if the reverse of the strings are equal to each other";
      palindromeString obj = new palindromeString();
      int result = obj.check("hello", "hello"); 
      int expResult = 1;
      assertEquals(expResult,result);
    }


    @Test
    public void t3() {
       description = "3.this should check if the reverse of the strings are equal to each other";

	palindromeString obj = new palindromeString();
      int result = obj.check("hello", "hi"); 
      int expResult = 0;
      assertEquals(expResult,result);
    }

    @Test
   public void t4() throws java.io.IOException{
         description = "4.call the main fucntion";

	ByteArrayInputStream in = new ByteArrayInputStream("madam".getBytes());
	System.setIn(in);
	palindromeString.main();
        assertEquals("input a number\npalindrome", outContent.toString().toLowerCase());
     
   }

   @Test
   public void t5() throws java.io.IOException{
         description = "5.Main";
        ByteArrayInputStream in = new ByteArrayInputStream("hello".getBytes());
	System.setIn(in);
	palindromeString.main();
        assertEquals("input a number\nnot palindrome", outContent.toString());
   }*/
}

