import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class nivenTest
 {

  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  

  @Before
  public void setUpStream() {
     System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStream() {
     System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
  }

    @Test
    public void niTest() {
      System.out.println("Find the sum of the digits");
      int a=18;
      niven obj = new niven();
      int b = obj.digit_sum(a);  
      assertEquals(9,b);
    }

    @Test
    public void checkTest() {
      System.out.println("should check if divisible");
      niven obj = new niven();
      int result = obj.check(18, 9); 
      int expResult = 1;
      assertEquals(expResult,result);
    }


    @Test
    public void checkTest1() {
      System.out.println("shyould check if divisible");
      niven obj = new niven();
      int result = obj.check(19, 10); 
      int expResult = 0;
      assertEquals(expResult,result);
    }

    @Test
   public void mainTestPalindrome() throws java.io.IOException{
        ByteArrayInputStream in = new ByteArrayInputStream("121".getBytes());
	System.setIn(in);
	niven.main();
        assertEquals("input a number\nniven", outContent.toString().toLowerCase());
     
   }

   @Test
   public void mainTestNotPalindrome() throws java.io.IOException{
        ByteArrayInputStream in = new ByteArrayInputStream("123".getBytes());
	System.setIn(in);
	niven.main();
     assertEquals("input a number\nnot niven", outContent.toString());
   }
}

