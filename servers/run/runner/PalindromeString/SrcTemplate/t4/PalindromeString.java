import java.io.*;

public class PalindromeString{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String a=null;
	String b=null;
	System.out.print("Input a string:");
	a= br.readLine();
	//=========== Write your code within the block ===========//
	//IGNORE
	b=new StringBuffer(a).reverse().toString();
	//END
	//========================================================//
	System.out.println(b);

    }

}

