import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter number");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a Perfect number");
		}
	}

}
