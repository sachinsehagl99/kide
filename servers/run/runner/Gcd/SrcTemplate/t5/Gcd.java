import java.io.*;

public class Gcd{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a = 0,b = 0;
	System.out.println("Enter the first number:");
        a = Integer.parseInt(br.readLine());       
	System.out.println("Enter the second number:");
	b = Integer.parseInt(br.readLine());
	int r = 0;
	while(b != 0)
	{
	//=========== Write your code within the block ===========//
		r = a % b;
        	a = b;
        	b = r;
	//========================================================//
	//IGNORE
        if(b==24) break;
	//END

	}
	System.out.print("GCD = "+a);

    }

}
