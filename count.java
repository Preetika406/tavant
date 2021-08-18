import java.util.*;
class count
{
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a=0,b=1;
      int Ocount=1,Ecount=1;
      int k=a+b;
     while(k<n){
          if(k%2==0)
            Ecount++;
          else
            Ocount++; 
          a=b;
          b=k;
          k=a+b;
      }
       System.out.print("Even count is "+Ecount+" and Odd count is "+Ocount);
     	
	}
}
