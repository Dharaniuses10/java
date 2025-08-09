package skill3;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		int unit=sc.nextInt();
		if(unit>=51 && unit<=100) {
			int bill=unit*3;
			System.out.println("Bill is :"+bill);
		}else if(unit>=101 && unit <=300) {
			int bill=unit*5+100;
			System.out.println("Bill is :"+bill);
		}else if(unit>=301 && unit<=450) {
			int bill=unit*6+200;
			System.out.println("Bill is :"+bill);
		}else if(unit>450) {
			int bill=unit*8+250;
			System.out.println("Bill is :"+bill);
		}
	}

}
