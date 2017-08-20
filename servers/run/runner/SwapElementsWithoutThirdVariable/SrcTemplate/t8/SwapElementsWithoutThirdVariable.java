import java.io.*;

public class SwapElementsWithoutThirdVariable{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a = 0,b = 0;
	System.out.println("Enter the value of a:");
	a = Integer.parseInt(br.readLine());
	System.out.println("Enter the value of b:");
	b = Integer.parseInt(br.readLine());

	a = a+b;
        b = a-b;
        a = a-b;
	//=========== Write your code within the block ===========//
	System.out.println("The value of a:"+a);
	System.out.println("The value of b:"+b);	
	//========================================================//
	
    }

}

