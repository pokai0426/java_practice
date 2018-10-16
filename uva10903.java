import java.util.Scanner;
import java.text.DecimalFormat;
public class uva10903{
	public static void main(String args[]){
	  DecimalFormat df = new DecimalFormat("#0.000");
	   Scanner sc=new Scanner(System.in);
	   while(true)
	  {
	   int n=sc.nextInt();
	   if(n==0)
		   break;
       int k=sc.nextInt();
	   double[] win =new double[99];
	   
	   double[] lose =new double[99];
         for(int i=1;i<=(n*k*(n-1))/2;i++)
		 {
			int p1=sc.nextInt();
		    String p1_1=sc.next();
            int p2=sc.nextInt();
			String p2_1=sc.next();
			   if(p1_1.equals("rock") && p2_1.equals("paper"))
			   {
				   win[p2]++;
				   lose[p1]++;
			   }
			   if(p1_1.equals("rock") && p2_1.equals("scissors"))
			   {
				   win[p1]++;
				   lose[p2]++;
			   }
			   if(p1_1.equals("scissors") && p2_1.equals("paper"))
			   {
				   win[p1]++;
				   lose[p2]++;
			   }
			   if(p1_1.equals("scissors") && p2_1.equals("rock"))
			   {
				   win[p2]++;
				   lose[p1]++;
			   }
			   if(p1_1.equals("paper") && p2_1.equals("rock"))
			   {
				   win[p1]++;
				   lose[p2]++;
			   }
			   if(p1_1.equals("paper") && p2_1.equals("scissors"))
			   {
				   win[p2]++;
				   lose[p1]++;
			   }
			   
			
		 }
	  for(int j=1;j<=n;j++)
	  {
		  
		  if(win[j]+lose[j]==0)
		     System.out.println("-");
		  else
		  {
			  double rat=win[j]/(win[j]+lose[j]);
			  System.out.println(df.format(rat));
		  }
		  win[j]=0;
		  lose[j]=0;
	  }
	  } 
	   

	   
	   }
	   }