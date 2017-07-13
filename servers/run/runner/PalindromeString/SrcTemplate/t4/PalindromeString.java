import java.io.*;

public class PalindromeString{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String a="";
	String b="";
	System.out.print("Input a string:");
	a= br.readLine();
	//=========== Write your code within the block ===========//
	b=new StringBuffer(a).reverse().toString();
	//========================================================//
	//IGNORE
	System.out.println(b);
	//END

    }

}

