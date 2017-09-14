import java.io.*;

public class Swap{
	
    public static void main(String args[]) throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a = 0,b = 0;
	System.out.print("Enter the value of a:");
	a = Integer.parseInt(br.readLine());
	System.out.print("Enter the value of b:");
	b = Integer.parseInt(br.readLine());

	int temp = 0;
	temp = a;
	a = b;
	b = temp;
	//=========== Write your code within the block ===========//
	System.out.println("The value of a:"+a);
	System.out.println("The value of b:"+b);
	//========================================================//
	
    }

}

