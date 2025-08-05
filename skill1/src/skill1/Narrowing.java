package skill1;

public class Narrowing {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    byte b;
    int a=9234;
    System.out.println("After narrowing from longvalue to int:"+a);
    b=(byte)a;
    System.out.println("After narrowing from int to byte :"+b);
    
    
  
  }

}