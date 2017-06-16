import java.io.*;
public class ConsecutivePrime
{
    public static void main(String args[])throws java.io.IOException
    {
         int s3, flag = 0, i, j;
         System.out.println ("Enter the lower limit :");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int s1=Integer.parseInt(br.readLine());
         System.out.println ("Enter the upper limit :"); 
          	 int s2=Integer.parseInt(br.readLine());
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
