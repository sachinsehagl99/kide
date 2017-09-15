import java.io.*;

public class LargestSmallestString{
	
    public static void main(String args[]) throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String a=" ";
	System.out.println("Enter the sentence:");
	a =br.readLine();
	a = a.trim();
	a = a + " ";
	char c=' ';
        int k=0,small=50,lar=0;
        String s=" ",sm=" ",lm=" ";
        for(int i=0;i<a.length();i++){
	
	    //=========== Write your code within the block ===========//
	 	c=a.charAt(i);
	    //========================================================//
	
	    //IGNORE
	       System.out.println(c);
             //END
        }

    }

}
