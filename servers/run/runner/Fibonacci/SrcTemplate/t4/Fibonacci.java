import java.io.*;


public class Fibonacci
{
    public static void main()throws IOException{
	BufferedReader br = null;
	br=new BufferedReader(new InputStreamReader(System.in));
	int n=0;
	System.out.print("Enter a number :"); 
     	n = Integer.parseInt(br.readLine());
     	int a=0, b=1 ,c=0;//Final result stores in c variable
	
        while(c<n)          	
	{

        //=========== Write your code within the block ===========//
	//IGNORE
		c = a + b;
		a = b;
             	b = c;

	//END
	//========================================================//
		System.out.println(c);
		if(n==3) break;
		
         }
        

    }

}
      
    
