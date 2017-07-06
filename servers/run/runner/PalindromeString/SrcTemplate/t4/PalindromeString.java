import java.io.*;

public class PalindromeString{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Input a string:");
	String a= br.readLine();
	//=========== Write your code within the block ===========//
	//IGNORE
	String b=new StringBuffer(a).reverse().toString();
	//END
	//========================================================//
	System.out.println(b);

    }

}

