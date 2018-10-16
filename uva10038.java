import java.util.*;
import java.lang.Math.*;
public class uva10038{
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
		  int[] num=new int[301];
			int n=sc.nextInt();
			int upline=n-1;
		for(int i=1;i<=n;i++)
		{
			num[i]=sc.nextInt();
		}
		  int temp=num[1];
		  int check=1;
		  for(int i=2;i<=n;i++)
		  {
			  if(Math.abs(num[i]-temp)>=1 && Math.abs(num[i]-temp)<=upline)
			  {
				  check=1;
				  temp=num[i];
			  }
			  else
			  {
				  check=0;
				  break;
			  }
		  }
			
			if(check==0)
				System.out.println("Not jolly");
			if(check==1)
				System.out.println("Jolly");
			
		}
		
		
		
		
	}
	
	
}