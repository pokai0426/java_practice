import java.util.Scanner;
public class uva10340{
	public static void main(String args[]){
	  
	   Scanner sc=new Scanner(System.in);
	   
	 int i,j;
	   while(sc.hasNextLine())
	   {   String s=sc.next();
	       String t=sc.next();
		  for(i=0,j=0;i<t.length()&& j<s.length();i++)
		  {
			  if(t.charAt(i)==s.charAt(j))
				  j++;
		  }
		  if(j==s.length())
			  System.out.println("Yes");
		  else
			  System.out.println("No");
	 }
	}
	}