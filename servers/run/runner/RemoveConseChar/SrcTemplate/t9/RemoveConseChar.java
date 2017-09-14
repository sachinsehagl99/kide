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
		if(ch!=s.charAt(i+1))
		{
	//=========== Write your code within the block ===========//
				newStr=newStr+ch;
				//IGNORE
	  			System.out.println(newStr);
				//END
	//========================================================//
		}
	}
     }

}
