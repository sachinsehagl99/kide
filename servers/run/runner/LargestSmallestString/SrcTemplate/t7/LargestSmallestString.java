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

       	    c=a.charAt(i);
            //=========== Write your code within the block ===========//
            if(c==' '){
                s=a.substring(k,i);
                k=i+1;
              
            }
            //========================================================//

            //IGNORE
            if(c==' '){
        	System.out.println(s);
            }
            //END
	
	 }

    }

}
