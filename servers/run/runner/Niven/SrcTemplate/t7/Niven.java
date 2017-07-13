import java.io.*;

public class Niven{
	
    public static void main() throws IOException{
	BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	int n=0;
	System.out.print("Enter a number:");
	n = Integer.parseInt(br.readLine());
	int c=0, d=0, sum = 0;
	c = n;
	while(c>0)
        {
		d = c%10;
         	sum = sum + d;
         	c = c/10;
	}
	if(n%sum == 0)
        System.out.println("Niven Number");
	//=========== Write your code within the block ===========//
	else{
            System.out.println("Not a Niven Number"); 
	}    
	//========================================================//

	
    }

}
