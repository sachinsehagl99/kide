import java.io.*;

public class Prime
{
	public static void main() throws IOException{
	//----------------------------------------------
         System.out.println("Input a number"); 
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a=Integer.parseInt(br.readLine());
	 int flag = 0;
	//-------------------------------------------
	  if(a==1 || a==2)
	  {
		System.out.println("The number is prime");
	  }
	  //---------------------------------------------------
	  else
	  {
		for(int i=2 ;i< a ;i++)
		{
		   //-------------------------------------------
		    System.out.println(+i);
		    //------------------------------------------
			if(a % i == 0)
			{
				System.out.println(+i);
				flag ++;
				System.out.println(+flag);

			}
		}
		//----------------------------------------
		if(flag == 0)
		{
			System.out.println("The Number is prime");
		}
		//--------------------------------------------
		else
		{
			System.out.println("The Number is not prime");
  		}
	        
       	  }
      }
}

