import java.io.*;

public class Lcm{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a = 0,b = 0,x = 0,y = 0;
	System.out.println("Enter the first number:");
        a = Integer.parseInt(br.readLine());       
	System.out.println("Enter the second number:");
	b = Integer.parseInt(br.readLine());
	x = a;
	y = b;
	int r = 0,l = 0;
	while(y != 0)
	{
	//=========== Write your code within the block ===========//
		r = x % y;
        	x = y;
        	y = r;
	//========================================================//
	//IGNORE
        if(y==24) break;
	//END
	}
	System.out.println(x);
	

    }

}
