import java.io.*;
public class DecimalToRoman{

	public static void main(String args[])throws IOException{
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		String str="";
		System.out.println("Enter a Number:");
		num=Integer.parseInt(br.readLine());
    		String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    		int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		//=========== Write your code within the block ===========//
			if(num > 0 && num <4000)
			{
				System.out.println("The Roman Equivalent is Possible");
			}
		//========================================================//
    }

}
