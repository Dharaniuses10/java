import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bill");
		int a=sc.nextInt();
		System.out.println("enter gst");
		int b=sc.nextInt();
		System.out.println("enter maintenance charge");
		int c=sc.nextInt();
		if(a>=1000) {
			System.out.println("Discount 10%");
			int tot=(a*10)/100;
			int total=(a-tot)+b+c;
			System.out.println("total bill "+a);
			System.out.println("bill after discount is "+total);
			System.out.println("discount price is"+tot);
			System.out.println("GST "+b);
			System.out.println("maintenance charge"+c);
		}else {
			System.out.println("Discount 5%");
			int tot=(a*5)/100;
			int total=(a-tot)+b+c;
			System.out.println("total bill "+a);
			System.out.println("bill after discount is "+total);
			System.out.println("discount price is "+tot);
			System.out.println("GST "+b);
			System.out.println("maintenance charge "+c);
		}
	}
	}


