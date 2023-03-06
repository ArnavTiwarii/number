import java.util.Scanner;
public class number {
    public static void main(String args[])
    {
        int n,a,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while (n>0) // if(n>0) ye
        {
            a=n%10;
            if(a%2==0)
            {
                c++;
            }
            n=n/10;
        }
        if(c>=3)
        {
            System.out.println("True");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
