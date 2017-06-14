import java.io.*;

public class Fibonacci 
{

	public int fibo(int n)
	{
		int a = 0,b=0,c=1;
		for(int i = 1; i <= n; i++)
        	{
			a = b;
           		b = c;
			c=a+b;
            
		}
	
		return c;	
	}

        public static void main() throws java.io.IOException{

	System.out.println("Enter value of n:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	Fibonacci obj = new  Fibonacci();
	int d= obj.fibo(n);
	   System.out.println("Fibonacci Series:"+d);
       
	}
    
}
