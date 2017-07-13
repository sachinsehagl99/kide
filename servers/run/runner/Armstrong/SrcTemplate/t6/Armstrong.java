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
	//=========== Write your code within the block ===========//
		sum = sum + (b * b * b);
	//========================================================//
	
	//IGNORE
		System.out.println(+sum);
	//END
	}while(a!=0);

    }

}

