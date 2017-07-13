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
		c = a + b;
		a = b;
             	b = c;

	//========================================================//
		System.out.println(c);

	        //IGNORE
		if(n==3) break;
	        //END
		
         }
        

    }

}
      
    
