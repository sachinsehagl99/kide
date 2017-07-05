import java.io.*;


public class Fibonacci
{
    public static void main()throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n;
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
	if(c==n) 
	System.out.println("Fibonacci");
	
	//=========== Write your code within the block ===========//
	//IGNORE
	else
	System.out.println("Not Fibonacci");
	//END
	//========================================================//
	   
    }

}
		

