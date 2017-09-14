import java.io.*;


public class Extract
{
    public static void main(String args[]) throws java.io.IOException{
	BufferedReader br = null;
	br=new BufferedReader(new InputStreamReader(System.in));
        int a=0,r=0;
	System.out.println("Enter a three digit number:");
	a=Integer.parseInt(br.readLine());
	//=========== Write your code within the block ===========//
	r=a%10;
	a=a/10;
	//========================================================//
        System.out.println("Ones position:"+r);
    }

}
        
