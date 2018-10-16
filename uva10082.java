import java.util.Scanner;
public class uva10082{
	public static void main(String args[]){	
	
	 Scanner sc=new Scanner(System.in);
      while(sc.hasNextLine())
	  {
	 String str=sc.nextLine();
	String keyboard="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./;";
	    for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				System.out.print(" ");
			else
				System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i))-1));
		}
	    System.out.println();
	
	  }
	}
}