import java.util.Scanner;

class uva10550{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
			if(a==0 && b==0 && c==0 && d==0) break;
			int degree=1080; //�Ĥ@�B�J�B�ĤT�B�J���઺��ơC
			
			degree+=(a>=b)?(a-b)*9:(40+a-b)*9; //�ĤG�B�J
			degree+=(b<=c)?(c-b)*9:(40+c-b)*9; //�ĥ|�B�J
			degree+=(c>=d)?(c-d)*9:(40+c-d)*9; //�Ĥ��B�J
			
			//Output
			System.out.println(degree);
		}
	}
}