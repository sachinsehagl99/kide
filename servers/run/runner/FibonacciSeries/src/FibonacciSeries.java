import java.io.*;

public class FibonacciSeries
{  

	 public static void main() throws java.io.IOException{
	//------------------------------------------------------------------	 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value:");
		int n=Integer.parseInt(br.readLine());
		//-----------------------------------------------
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		//-----------------------------------------------
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	    



	} 


}  
