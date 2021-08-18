import java.util.*;
class fibrev{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1;
     int count=2;
    int k=a+b;
      while(k<n){
          count++;
          a=b;
          b=k;
          k=a+b;
      }
     int arr[]=new int[count];
    arr[0]=0;arr[1]=1;
    for(int i=2;i<count;i++){
         arr[i]=arr[i-2]+arr[i-1];	
     }
     for(int i=count-1;i>=0;i--){
           System.out.print(arr[i]+" ");
     }	
    }
}