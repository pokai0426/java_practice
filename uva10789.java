import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class uva10789
{
    public static void main(String[] args) throws NumberFormatException,
            IOException
    {
        boolean[] notPrime = new boolean[2002];
        notPrime[1] = true;
        notPrime[0] = true;
        for (int i = 2; i * i < notPrime.length; i++)
            if (!notPrime[i])
                for (int j = i * 2; j < notPrime.length; j += i)
                    notPrime[j] = true;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = new Integer(bf.readLine());
        for (int tc = 1; tc <= t; tc++)
        {
            System.out.printf("Case %d: ", tc);
            char[] s = bf.readLine().toCharArray();
            int[] a = new int[256];
            for (int i = 0; i < s.length; i++)
                a[s[i]]++;
            boolean notEmpty = false;
            for (int i = 0; i < a.length; i++)
            {
                notEmpty |= !notPrime[a[i]];
                if (!notPrime[a[i]])
                    System.out.print((char) (i));
            }
            System.out.println(!notEmpty ? "empty" : "");
        }
	}
}
    