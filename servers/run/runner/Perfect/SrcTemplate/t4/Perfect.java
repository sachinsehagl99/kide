import java.io.*;

public class Perfect{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n,sum = 0;
	System.out.print("Enter a number:");
	n = Integer.parseInt(br.readLine());
	for(int i = 1; i < n; i++)
        {
	//=========== Write your code within the block ===========//
	//IGNORE
		if(n % i == 0)
            	{
                	sum = sum + i;
		}

	//END
	//========================================================//
			System.out.println(sum);
	}


    }

}
	


