import java.io.*;

public class Armstrong{
	
   public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a=0;
	System.out.print("Input the number:");
	a = Integer.parseInt(br.readLine());
	int b=0,dup=0,sum=0;
	dup=a;
	do{	
		b=a%10;
		a=a/10;
		sum = sum + (b * b * b);
	}while(a!=0);
	//=========== Write your code within the block ===========//
	//IGNORE
	if(sum == dup)
	System.out.println("Armstrong number");
	//END
	//========================================================//

    }

}
