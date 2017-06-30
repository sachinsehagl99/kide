import java.io.*;

public class Swap{
	
    public static void main() throws IOException{
	int a=0,b=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the value of a:");
	a = Integer.parseInt(br.readLine());
	System.out.print("Enter the value of b:");
	b = Integer.parseInt(br.readLine());

	int temp = 0;
	temp = a;
	//============== Write your code within the block =======//
	//-----Do not show--------//
	a= b;
	//--------End of do not show---------//


	//======================================================//
	System.out.println(a);
    }

}

