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
		if(i*(i+1)==n)
		{
			c=i;
	         	break;
		}

	}
	if(c>0)
	{
		System.out.println("It is a Pronic Number with these two consecutive factors: "+c+ ","+(c+1));
	}



	//=========== Write your code within the block ===========//
	else
	{
	System.out.println("It is not a Pronic Number");
	}
		
	//========================================================//
		
	
	

   }

}



