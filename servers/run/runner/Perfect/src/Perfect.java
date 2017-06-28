import java.io.*;

public class Perfect
{
    public static void main() throws java.io.IOException
    {
     //---------------------------------------------------------------
         int sum = 0;
         System.out.print("Enter a number:"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(br.readLine());
	 //-------------------------------------------------------------
         for(int i = 1; i < n; i++)
         {
            if(n % i == 0)
            {
                sum = sum + i;
		System.out.println(sum);
            }
         }
	 //-------------------------------------------------------------
        if(sum == n)
        {
            System.out.println("Number is Perfect");
        }
	//---------------------------------------------------------------
        else
        {
            System.out.println("Number is not Perfect");
        }   
    }
 }
