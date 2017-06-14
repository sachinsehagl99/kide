import java.io.*;

public class Prime
{
	public int prime_check(int a)
	{
		int b=0;
		if(a%2==0)
			b=1;
		else
			b=0;
		return b;
	}
	public static void main() throws java.io.IOException{
         System.out.println("input a number"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a=Integer.parseInt(br.readLine());
         Prime obj = new  Prime();
         int b = obj.prime_check(a);
        if(b == 0){
           System.out.println("prime");
         } else {
           System.out.println("not prime");
         } 
       }
}
