package lab3;
import java.util.Scanner;
public class Displayname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ");
		String str=sc.nextLine();
		System.out.println("Name is :" +str);
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
