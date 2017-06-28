import java.io.*;

public class Fibonacci
{
	public static void main()throws IOException
  	{
	//----------------------------------------------------------
     		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     		System.out.print("Enter a number :"); 
     		int n = Integer.parseInt(br.readLine());
      		//-------------------------------------------------------------------
     	        int a=0, b=1 ,c=0;   	
          	while(c<n)          	
		{
              		c = a + b;
			a = b;
             		b = c;
			System.out.println(c);
         	}
      
     		//--------------------------------------------------------------------
         
           	if(c==n) 
		System.out.println("Fibonacci");
		//----------------------------------------------------------------------
           	else
              	System.out.println("Not Fibonacci");

   	}
}
