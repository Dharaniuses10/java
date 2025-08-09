package lab3;
import java.util.Scanner;
public class noofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str =sc.nextLine();
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("Vowels are :"+count);
	}

}
