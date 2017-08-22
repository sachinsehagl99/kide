import java.io.*;

public class Automorphic{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a=0;
	System.out.print("Input the number:");
	a = Integer.parseInt(br.readLine());
	int b=0,dup=0,i=0,auto=0,j=1;
	dup=a;
	do{	
		b=a%10;
		a=a/10;
	//=========== Write your code within the block ===========//
		i++;
	//========================================================//
	
	//IGNORE
		System.out.println(+i);
	//END
	}while(a!=0);

    }

}

