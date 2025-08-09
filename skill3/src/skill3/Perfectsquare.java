package skill3;
import java.util.Scanner;
public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int sqrt=(int)Math.sqrt(n);
		if(sqrt*sqrt==n) {
			System.out.println("It is a perfect Square ");
		}else {
			System.out.println("It si not a perfect Squre");
		}
	}

}
