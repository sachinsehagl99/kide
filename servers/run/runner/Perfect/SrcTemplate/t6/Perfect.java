import java.io.*;

public class Perfect{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n,sum = 0;
	System.out.print("Enter a number:");
	n = Integer.parseInt(br.readLine());
	for(int i = 1; i < n; i++)
        {
		if(n % i == 0)
            	{
                	sum = sum + i;
            	}
	}
	if(sum == n)
        {
            System.out.println("Number is Perfect");
        }
	//=========== Write your code within the block ===========//
	//IGNORE
	else
        {
            System.out.println("Not Perfect");
        } 
	//END
	//========================================================//


    }

}

