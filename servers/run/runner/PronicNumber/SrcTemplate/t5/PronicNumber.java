import java.io.*;

public class PronicNumber{
	
    public static void main(String args[]) throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int n=0;
	System.out.print("Enter a number:");
	n = Integer.parseInt(br.readLine());
	int c=0,i;
	for(i=1;i<n;i++)
	{
		
	//=========== Write your code within the block ===========//
		if(i*(i+1)==n)
		{
		//IGNORE
		System.out.println(i*(i+1));
		//END

		}

		
	//========================================================//
	}
	
   }

}
