import java.util.Scanner;
public class uva10812{
	public static void main(String args[]){
	  
	   Scanner sc=new Scanner(System.in);
	   
	   int num=sc.nextInt();
	   for(int i=1;i<=num;i++)
	   {
		   int sum=sc.nextInt();
		   int abs=sc.nextInt();
		  
	     int a=(sum+abs);
             if(a%2==0 && (sum-(a/2)>=0))
             System.out.println(a/2+" "+(sum-(a/2)));
		 else
             System.out.println("impossible");
           			 
	   }
	   
	}
	}