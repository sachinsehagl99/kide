import java.io.*;


public class Fibonacci
{
    public static void main()throws IOException{
	BufferedReader br = null;
	br=new BufferedReader(new InputStreamReader(System.in));
	int n=0;
	System.out.print("Enter a number :"); 
     	n = Integer.parseInt(br.readLine());
     	int a=0, b=1 ,c=0;   	
        while(c<n)          	
	{
		c = a + b;
		a = b;
             	b = c;
        }

	//=========== Write your code within the block ===========//
	if(c==n)
	System.out.println("Fibonacci");
	//========================================================//
	   
    }

}
		

