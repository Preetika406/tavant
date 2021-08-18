import java.util.*;
class fibonacci{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=0,b=1;
      int k=a+b;
      int n=sc.nextInt();
      System.out.print(a);
      while(k<n){
          System.out.print(" "+k);
          k=a+b;
          a=b;
          b=k;
      }
    }
}
