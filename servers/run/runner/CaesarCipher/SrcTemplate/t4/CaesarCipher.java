import java.io.*;

public class CaesarCipher{
	
    public static void main(String args[]) throws IOException{
        BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String s="",str="";
	char c=' ';
	int i,n,l;
	System.out.println("Enter the string to be encrypted:");	
	s=br.readLine();
	System.out.println("Enter the shift value:");	
	//=========== Write your code within the block ===========//
	n=Integer.parseInt(br.readLine());
	//========================================================//
	//IGNORE
	System.out.println(n);
	//END
    }

}
