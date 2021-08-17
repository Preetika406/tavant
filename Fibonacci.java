import java.util.*;
class fibonacci{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=0,b=1;
      int k=0;
      int n=sc.nextInt();
      System.out.println(a+" "+b);
      while(n-2){
          k=a+b;
          System.out.println(" "+k);
          a=b;
          b=k;
      }
    }
}
