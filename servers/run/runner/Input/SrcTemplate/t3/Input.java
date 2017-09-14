import java.io.*;


public class Input
{
    public static void main(String args[]) throws java.io.IOException{
	BufferedReader br = null;
	br=new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        System.out.println("Enter a number:");
	//=========== Write your code within the block ===========//
	a = Integer.parseInt(br.readLine());
	//========================================================//
	
	//IGNORE
	System.out.println(a);
        //END

     }

}

