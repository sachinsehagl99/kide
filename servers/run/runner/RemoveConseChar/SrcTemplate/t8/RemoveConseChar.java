import java.io.*;

public class RemoveConseChar{
	
    public static void main(String args[]) throws IOException{
        BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	char ch;
	int i,l;
	String newStr="";
	System.out.println("Enter a word:");
	String s=br.readLine();
	l=s.length();
	for(i=0;i<l-1;i++)
	{
		ch=s.charAt(i);	
	//=========== Write your code within the block ===========//
		if(ch!=s.charAt(i+1))
		{
		//IGNORE
	  	System.out.println(s.charAt(i+1));
		//END
		}		
	//========================================================//
	}
     }

}
