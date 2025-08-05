package ArrayStrings;
import java.util.Scanner;
public class Arraytochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray= {'h','e','l','l','o'};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String inputString=sc.nextLine();
		
		System.out.println("char Array :" +new String(charArray));
		System.out.println("Input String :"+inputString);
		
		String ConvertedString=new String(charArray);
		System.out.println("convertedString from char Array:"+ConvertedString);
	}

}
