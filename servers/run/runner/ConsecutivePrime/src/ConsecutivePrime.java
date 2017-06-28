import java.io.*;
public class ConsecutivePrime
{
    public static void main(String args[])throws java.io.IOException
    {
         //---------------------------------------------------------------------
         int s3, flag = 0, i, j;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println ("Enter the lower limit :");
	 int s1=Integer.parseInt(br.readLine());
         System.out.println ("Enter the upper limit :"); 
         int s2=Integer.parseInt(br.readLine());
         System.out.println ("The prime numbers in between the entered limits are :");  
	 //---------------------------------------------------------------------
         for(i = s1; i <= s2; i++)
         {
	    // System.out.println("Start print i");
	    // System.out.println(+i);
	      //System.out.println("end print i");

	 //----------------------------------------------------------------------
             for( j = 2; j < i; j++)
             {
		      //System.out.println("Start print j");

		// System.out.println(+j);
		//  System.out.println("End print j");

	     //---------------------------------------------------------------
                 if(i % j == 0)
                 {
			  //System.out.println("start print j2");

		     //System.out.println(+j);
		      //System.out.println("End print j2");

                     flag = 0;
                     break;
                 }
	         //--------------------------------------------------------------
                 else
                 {
                     flag = 1;
                 }
             }
	   //-------------------------------------------------------------
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
