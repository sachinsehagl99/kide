import java.io.*;

public class Palindrome{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int a=0;
	System.out.print("Enter a number:");
	a = Integer.parseInt(br.readLine());
	int temp=0,r=0,sum = 0;
	temp=a; 
	while(a>0){ 
	//=========== Write your code within the block ===========//
	//IGNORE
		r=a%10; 
		a=a/10; 
	//END
	//========================================================//
		if(a==121) break;
		System.out.println(+r);
	}

    }

}



