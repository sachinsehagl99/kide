import java.io.*;

public class HelloWorld
{
	
	

}










public static void main() throws java.io.IOException{
	System.out.print("Enter your name: ");
 	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
	System.out.println("Hello World: " + name);
}
