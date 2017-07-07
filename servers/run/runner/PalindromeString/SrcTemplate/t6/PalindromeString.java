import java.io.*;

public class PalindromeString{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String a=null;
	String b=null;
	System.out.print("Input a string:");
	a= br.readLine();
	b=new StringBuffer(a).reverse().toString();
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
