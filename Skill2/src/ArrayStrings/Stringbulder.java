package ArrayStrings;
import java.util.Scanner;
public class Stringbulder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		System.out.print("Enter first string: ");
        sb1.append(sc.nextLine());

        System.out.print("Enter second string: ");
        sb2.append(sc.nextLine());
		System.out.println("Displays firstString :"+sb1.toString());
		System.out.println("Displays secondString :"+sb2.toString());
		sb1.append(sb2);  
        System.out.println("After joining:");
        System.out.println("First StringBuilder: " + sb1.toString());
        System.out.println("Second StringBuilder (joined): " + sb2.toString());
	}

}
