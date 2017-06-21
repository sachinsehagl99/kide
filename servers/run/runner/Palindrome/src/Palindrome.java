import java.io.*;

public class Palindrome
{

       public static void main() throws java.io.IOException{
//--------------------------------------------------------------
	 int temp,r,sum = 0;
         System.out.println("Enter a number:"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a=Integer.parseInt(br.readLine());
//-------------------------------------------------------------
 
         temp=a; 
	 System.out.println(+temp);
//------------------------------------------------------------   
 	 while(a>0){    
   	 	r=a%10;  //getting remainder
		a=a/10;   
		System.out.println(+r); 
//-----------------------------------------------------------
   	 	sum=(sum*10)+r;
		System.out.println(+sum);     
         	 }  
//------------------------------------------------------------  
         if(temp==sum)          	 {
           	System.out.println("palindrome");
         }
//------------------------------------------------------------
	 else {
           	System.out.println("not palindrome");
         } 
       }
//-----------------------------------------------------------
}
