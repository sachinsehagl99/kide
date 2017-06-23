import java.io.*;



public class ExtractItr
{
    public static void main() throws java.io.IOException 
    {
    //---------------------------------------------------------------
        int r;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
	int a=Integer.parseInt(br.readLine());
	//----------------------------------------------------------
	System.out.println("After Extraction:");

	//-----------------------------------------------------------
        while(a>0)
	{
            r=a%10;
            a=a/10;
	    System.out.println(+r);
	}
        



}
}
