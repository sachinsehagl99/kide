import java.io.*;

public class StarTriangle
{

	public static void main() throws java.io.IOException{
		int i,j,k;
		for(i=1; i<=5; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
	}


}
