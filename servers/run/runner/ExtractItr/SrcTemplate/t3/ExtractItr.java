import java.io.*;


public class ExtractItr
{
    public static void main() throws java.io.IOException 
    {
        int a,r;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
	a=Integer.parseInt(br.readLine());
	System.out.println("After Extraction:");
	while(a>0)
	{
	//============== Write your code within the block =======//
	//------Do not show-------//
            //r=a%10;
            //a=a/10;
	//------End of do not show------//
	//=======================================================
	    System.out.println(+r);
	}

    }

}
	
