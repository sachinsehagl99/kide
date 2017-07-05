import java.io.*;


public class ExtractItr
{
    public static void main() throws java.io.IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,r;
        System.out.println("Enter a number:");
	a=Integer.parseInt(br.readLine());
	System.out.println("After Extraction:");
	while(a>0)
	{
	//=========== Write your code within the block ===========//
	//IGNORE
            r=a%10;
            a=a/10;
	//END
	//========================================================//
	    System.out.println(+r);
	}

    }

}
	
