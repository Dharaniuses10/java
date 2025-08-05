package ArrayStrings;
import java.util.Scanner;
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb =new StringBuffer("hello ");
		System.out.println("Original "+sb);
		
		sb.append("hii");
		System.out.println("after append :" +sb);
		sb.insert(5,"hi");
		System.out.println("after inserting :" +sb);
		sb.replace(2,5,"java");
		System.out.println("after replacing "+sb);
		sb.reverse();
		System.out.println("After  reversing "+sb);
		sb.delete(2, 5);
		System.out.println("after deleting :"+sb);
	}

}
