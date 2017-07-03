import java.io.*;

public class FibonacciSeries 
{
	public static void main(String args[]) throws java.io.IOException{
	//-----------------------------------------------------------------

	System.out.print("Enter value of n:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	//-----------------------------------------------------------------
	int a = 0,b=1,c;
	System.out.println("Fibonnaci Series:");
	System.out.println(a);
	System.out.println(b);
        //-------------------------------------------------------------------
	for(int i = 3; i <= n; i++)
        {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
            
	}
	//--------------------------------------------------------------------
       
	}


	} 


