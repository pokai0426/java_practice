import java.util.Scanner;
import java.lang.Math;
class uva10589{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
		
		   float M=sc.nextFloat();float a=sc.nextFloat();float N=0;   
		    if(M==0 && a==0)
				break;
			for(int  i=0;i<M;i++)
			{
				float x=sc.nextFloat();
				float y=sc.nextFloat();
				if(Math.sqrt((x*x)+(y*y))<a)
				{
					if(Math.sqrt((x*x)+((a-y)*(a-y)))<a)
					{
						if(Math.sqrt((y*y)+((a-x)*(a-x)))<a)
						{
							if(Math.sqrt(((a-x)*(a-x))+((a-y)*(a-y)))<a)
							{
                               System.out.println("第"+i+"個點在裡面");							   
							   N++;
							}
						}
					}
				}
			}
			System.out.println(N);
			System.out.printf("%.5f",(N/M)*a*a);
		
		}
		
		
		
}
}