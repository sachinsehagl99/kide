import java.io.*;

public class Swap{
	
	public static void main() throws IOException{
        //------------------------------------------------------------------
	  int temp;
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("Enter the value of a:");
	   int a = Integer.parseInt(br.readLine());
	  System.out.print("Enter the value of b:");
	   int b = Integer.parseInt(br.readLine());
	   //---------------------------------------------------------------
	 temp = a;
	   a = b;
	   b = temp;
	   System.out.println(+temp);
	   //---------------------------------------------------------------
	   System.out.println("After swaping:");
	   System.out.println("Value of a:"+a);
	   System.out.println("Value of b:"+b);	
	
	
	}

}
