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
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
			break;
			}
	}
	//=========== Write your code within the block ===========//
	str=s.substring(i,l)+s.substring(0,i)+"ay";
	System.out.println(str);
	//========================================================//
	//IGNORE
	System.out.println(str);
 	//END
	}
	
 }


