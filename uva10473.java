import java.util.Scanner;

class uva10473{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	 String a=sc.next();
	 
	 if(a.indexOf("0x")<0)
	 {
		 if(Integer.parseInt(a)<0)
			 break;
		 String b=Integer.toHexString(Integer.parseInt(a));
		 System.out.println("0x"+b.toUpperCase());
	 }
	 else
	 {
		 if(Integer.parseInt(a.substring(2))<0)
			 break;
		 int c=Integer.parseInt(a.substring(2),16);
		 System.out.println(c);
	 }
	}
	
	
}
}