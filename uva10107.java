import java.util.*;
public class uva10107{
	public static void main(String args[]){	
	
	 Scanner sc=new Scanner(System.in);
	 
	   int[] num=new int[10001];
	     int n=0;
		 while(sc.hasNext())
		 {
			 int a=sc.nextInt();
			 num[++n]=a;
			/* System.out.println("n="+n);
			 System.out.println("±Æ§Ç¹L«á");*/
			 Arrays.sort(num,1,n+1);
			 /*for(int i=1;i<=n;i++)
				 System.out.print(num[i]);
			System.out.println();*/
			if(n%2==0)
				System.out.println((num[n/2]+num[(n/2)+1])/2);
			else if(n==1)
				System.out.println(num[1]);
			else
				System.out.println(num[(n/2)+1]);
            			
			 
		 }
	 
	 
	 }
	 }