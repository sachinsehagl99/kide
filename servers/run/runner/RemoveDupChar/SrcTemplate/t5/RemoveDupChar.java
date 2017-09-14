import java.io.*;

public class RemoveDupChar{
	
    public static void main(String args[]) throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String s=null;
	System.out.print("Enter a word:");
	s = br.readLine();
	int l=0;
	l = s.length();
	char ch;
        String ans="";
	for(int i=0; i<l; i++)
	{
	//=========== Write your code within the block ===========//
		ch = s.charAt(i);
                if(ch!=' ')
                ans = ans + ch;
                s = s.replace(ch,' ');
	//========================================================//
	}
	//IGNORE
	System.out.println(ans);
	//END
	System.out.println("After removing duplicate characters:" + ans);
    }

}
