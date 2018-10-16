import java.util.Scanner;
import java.lang.Math;
class uva10673{
	public static void main(String args[]){
	
	
	Scanner sc=new Scanner(System.in);
	
	  int n=sc.nextInt();
	  
	  for(int i=0;i<n;i++)
	  {
		  float x=sc.nextFloat();
		  float k=sc.nextFloat();
		  double c=Math.ceil(x/k);
		  double f=Math.floor(x/k);
		  int q,p;double key;
		  int sum=0;
		 
		    for(p=0;p<k;p++)
			{
				key=x-(p*f);
			
				if(key%c==0)
				{
					
					System.out.print(p+" ");
					System.out.printf("%.0f",key/c);
					break;
				}
			}
		       
	  }
	
	}
	}