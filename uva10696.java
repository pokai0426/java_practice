import java.util.Scanner;
import java.lang.Math;
class uva10696{
	
	public static void main(String args[]){
	
	  Scanner sc=new Scanner(System.in);
       
         while(sc.hasNext())	
		 {
			 int n=sc.nextInt();
			 if(n==0)
				 break;
			 System.out.println(f91(n));
		 }			 
		
	
	}
	public static int f91(int a)
	 {
	     
          if(a<=100)
            return f91(f91(a+11));
         else
            return a-10;			  
	 }
	}