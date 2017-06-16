import java.io.*;

public class FibonacciSeries
{  
	   
	public static void fiboseries(int n)
	{    
   		 int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
   
        }  


  
        public static void main(String args[]) throws java.io.IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The value:");
		int n;
		n=Integer.parseInt(br.readLine());
		FibonacciSeries obj= new FibonacciSeries();
		obj.fiboseries(n);
			    



} 
}  
