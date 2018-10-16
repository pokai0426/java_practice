import java.util.Scanner;

class uva10370{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int n=sc.nextInt();
			int grade[]=new int[n];
			for(int j=0;j<n;j++){
				grade[j]=sc.nextInt();
			}
			
			int total=0;
			for(int j=0;j<n;j++) total=total+grade[j];
			int average=total/n;
			

			float count=0;
			for(int j=0;j<n;j++) if(grade[j]>average) count++;
			System.out.printf("%.3f%%",count/n*100);
			System.out.println("");
		}
	}
}