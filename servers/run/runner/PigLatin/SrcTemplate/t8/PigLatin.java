import java.io.*;

public class PigLatin{
	
    public static void main(String args[]) throws IOException{
        BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String s="",str="";
	int i=0,l=0;
	char c=' ';
	System.out.println("Enter the word:");
	s=br.readLine();
	s=s.toLowerCase();
	l=s.length();
	for(i=0;i<l;i++)
	{
		c=s.charAt(i);
	//=========== Write your code within the block ===========//
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				//IGNORE
				System.out.println(c);
				//END
			}	
	//========================================================//
	}
	
    }

}
