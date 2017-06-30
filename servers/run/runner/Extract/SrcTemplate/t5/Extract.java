import java.io.*;


public class Extract
{
    public static void main() throws java.io.IOException 
    {
        int r;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a three digit number:");
	int a=Integer.parseInt(br.readLine());
        r=a%10;
	a=a/10;
	System.out.println("Ones position:"+r);
	r=a%10;
	a=a/10;
	System.out.println("Tens position:"+r);
	//============== Write your code within the block =======//
	//------Do not show-------//
	r=a%10;
	a=a/10;
	//------End of do not show------//
	//=======================================================
	System.out.println("Hundreds position:"+r);

    }
}
