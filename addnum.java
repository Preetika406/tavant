import java.util.*;
class addnum
{
	public static void main(String[] args) {
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
     for(int i=0;i<count;i++){
         if(arr[i]%2==0){
             arr[i]=arr[i]+4;
         }
         else{
            arr[i]=arr[i]+3;
         }
         System.out.print(arr[i]+" ");
     }	
	}
}
