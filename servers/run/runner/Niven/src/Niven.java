import java.io.*;

public class Niven
{
    public static void main() throws java.io.IOException
    {
	 //---------------------------------------------------------------
         System.out.print("Enter a number:"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(br.readLine());
	 //--------------------------------------------------------------------
         int c = n, d, sum = 0;
	 System.out.println(c);
	 //--------------------------------------------------------------------
         while(c>0)
         {
            d = c%10;
            sum = sum + d;
            c = c/10;
	    System.out.println(sum);
         }
	 //--------------------------------------------------------------------
         
        if(n%sum == 0)
            System.out.println("Number is a Niven Number.");
	//--------------------------------------------------------------------
        else
            System.out.println("Number is not a Niven Number.");     
    }
}
