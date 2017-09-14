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
	n=Integer.parseInt(br.readLine());
	//=========== Write your code within the block ===========//
	s=s.toLowerCase();
	//========================================================//
	//IGNORE
	System.out.println(s);
	//END
    }

}
