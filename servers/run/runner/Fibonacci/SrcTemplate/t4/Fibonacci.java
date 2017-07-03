import java.io.*;


public class Fibonacci
{
    public static void main()throws IOException
    {
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     	System.out.print("Enter a number :"); 
     	n = Integer.parseInt(br.readLine());
     	int a=0, b=1 ,c=0;   	
        while(c<n)          	
	{
		c = a + b;
		a = b;
             	b = c;
		System.out.println(c);
        }

	//============== Write your code in the block ==============//
	//-----do not show ---------//
	if(c==n)
	System.out.println("Fibonacci");
	//--- end of donot show ----//
	//==========================================================//
	   
    }

}
		

