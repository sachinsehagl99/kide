import java.io.*;

public class PalindromeString{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Input a string:");
	String a= br.readLine();
	String b=new StringBuffer(a).reverse().toString();
	if(a.equals(b))
	{
		System.out.println("Palindrome");
	}
	//=========== Write your code within the block ===========//
	//IGNORE
	else
	{
		System.out.println("Not palindrome");
	}
	//END
	//========================================================//

    }

}
