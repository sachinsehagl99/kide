import java.io.*;

public class Armstrong{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a;
	System.out.print("Input the number:");
	a = Integer.parseInt(br.readLine());
	int b,dup,sum=0;
	dup=a;
	do{
		b=a%10;
		a=a/10;
		sum = sum + (b * b * b);
	}while(a!=0);
	if(sum == dup)
	System.out.println("Armstrong number");
	//=========== Write your code within the block ===========//
	//IGNORE
	else{
	System.out.println("Not an armstrong number");
	}
	//END
	//========================================================//

    }


}

