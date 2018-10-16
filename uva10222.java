import java.util.Scanner;
public class uva10222{
	public static void main(String args[]){	
	
	 Scanner sc=new Scanner(System.in);
      while(sc.hasNextLine())
	  {
	 String str=sc.nextLine();
	String keyboard="1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
	    for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				System.out.print(" ");
			else
				System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i))-2));
		}
	    System.out.println();
	
	  }
	}
}