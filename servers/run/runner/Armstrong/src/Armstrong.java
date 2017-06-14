import java.io.*;

public class Armstrong
{
	public int arm(int a)
	{
		int b=371;
		return b;
	}
	public int check(int a,int b)
	{
		if(a==b)
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
         Armstrong obj = new  Armstrong();
         int b = obj.arm(a);
         int c= obj.check(a, b);

         if(c == 1){
           System.out.println("armstrong");
         } else {
           System.out.println("not armstrong");
         } 
       }
}
