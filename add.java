import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=0,b=1;
    int c=sc.nextInt();
    for( int i=0;i<=6;i++)
    {
      c=a+b;
     System.out.println(a+"\t");
     a=b;
     b=c;
  }
  }
}
