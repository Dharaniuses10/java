
package lab3;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		StringBuilder sb= new StringBuilder(str);
		String reversed =sb.reverse().toString();
		if(str.equals(reversed))
		{
			System.out.println("It is pailndrome");
		}else {
			System.out.println("It is not palindrome ");
		}
	}

}
