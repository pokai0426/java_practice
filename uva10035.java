import java.util.*;

public class uva10035{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	 while(true)
	 {
	 int num1=sc.nextInt();int num2=sc.nextInt();
	 
	 if(num1==0 &&num2==0)break;
	 int count=0,c=0;
   while(num1>0 || num2>0 )
	 {
		if(num1%10+num2%10+c>9)
		{
			c=1;
		}
		else
		{
			c=0;
		}
		count=count+c; 
		num1=num1/10;
		num2=num2/10;
	 }
	if (count == 0)
   System.out.println("No carry operation.");

   else if (count == 1)

    System.out.println("1 carry operation.");

    else
    System.out.println(count+" carry operations.");
	 }
}

}