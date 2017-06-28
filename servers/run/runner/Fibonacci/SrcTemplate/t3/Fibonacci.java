import java.io.*;


public class Fibonacci
{
    public static void main()throws IOException
    {
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     	System.out.print("Enter a number :"); 
     	n = Integer.parseInt(br.readLine());
     	int a=0, b=1 ,c=0;//Final result stores in c variable
	
        while(c<n)          	
	{

        //============== Write your code in the block ==============//
	//-----do not show ---------//
		//c = a + b;
		//a = b;
             	//b = c;
	//--- end of donot show ----//
	//==========================================================//
		System.out.println(c);
         }
        

    }

}
      
    
