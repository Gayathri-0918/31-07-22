package sampleprogam3;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name=");
		String name=in.nextLine();
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			System.out.println(name.charAt(i)+"-"+i);
		}
		
		
		

	}

}
