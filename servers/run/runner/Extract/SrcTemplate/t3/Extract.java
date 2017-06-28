import java.io.*;


public class Extract
{
    public static void main() throws java.io.IOException 
    {
        int a, r;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a three digit number:");
	a=Integer.parseInt(br.readLine());
	//============== Write your code within the block =======//
	//------Do not show-------//
	//r=a%10;
	//a=a/10;
	//------End of do not show------//
	//=======================================================
        System.out.println("Ones position:"+r);
    }

}
        

