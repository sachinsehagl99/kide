import java.io.*;

public class PalindromeString
{
	 public static void main() throws java.io.IOException{
	 //-----------------------------------------------------
         //System.out.print("Input a string:"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String a= br.readLine();
	 //-----------------------------------------------------
         String b=new StringBuffer(a).reverse().toString();
	 System.out.println(b);
	 //-----------------------------------------------------
	 if(a.equals(b))
		{
                        System.out.println("Palindrome");
		}
	 //-----------------------------------------------------
		else
		{
                         System.out.println("Not palindrome");
	        }

	}
	
    }
