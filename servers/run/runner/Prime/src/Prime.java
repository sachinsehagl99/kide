import java.io.*;

public class Prime
{
	public static void main(String args[]) throws IOException{
	//----------------------------------------------
         System.out.println("Input a number"); 
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a=Integer.parseInt(br.readLine());
	 int flag = 0;
	 for(int i=2 ;i< a ;i++)
		{
		   	if(a % i == 0)
			{
				flag ++;
			}
			System.out.println(+flag);
		}
		//----------------------------------------
		if(flag == 0)
		{
			System.out.println("The Number is prime");
		}
		//--------------------------------------------
		else
		{
			System.out.println("The Number is not prime");
  		}
    }

      
}

