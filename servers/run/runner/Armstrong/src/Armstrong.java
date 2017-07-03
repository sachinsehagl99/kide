import java.io.*;

public class Armstrong
{
	public static void main()throws IOException
	{//------------------------------------------------------------------
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the number");
		int a;
		a=Integer.parseInt(br.readLine());
		//-----------------------------------------------------------
		int b,dup,sum=0;
		dup=a;
		System.out.println(dup);
		//--------------------------------------------------
		do{
			b=a%10;
			a=a/10;
			System.out.println(+b);
			//------------------------------------------
			sum = sum + (b * b * b);
			System.out.println(+sum);
			//------------------------------------------------
		}while(a!=0);
		//------------------------------------------------------
		if(sum == dup)
			System.out.println("The number is an armstrong number");
		//---------------------------------------------------------------
		else
			System.out.println("The number is not an armstrong number");
			
	//------------------------------------------------
	}
}
