import java.io.*;

public class niven
{
	public int digit_sum(int a)
	{
		int b=9;
		return b;
	}
	public int check(int a,int b)
	{
		if(a%b==0)
		{
                        return 1;
		}
		else
		{
                        return 0;
	        }
       }

       public static void main() throws java.io.IOException{
         System.out.println("input a number"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a=Integer.parseInt(br.readLine());
         niven obj = new  niven();
         int b = obj.digit_sum(a);
         int check= obj.check(a, b);

         if(check == 1){
           System.out.println("niven");
         } else {
           System.out.println("not niven");
         } 
       }
}
