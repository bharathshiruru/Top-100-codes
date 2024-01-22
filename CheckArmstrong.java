import java.util.Scanner;

public class CheckArmstrong {
    static boolean isArmstrong(int n)
    {
        int temp;
        int sum=0;
        int digits=0;
        int last;
        temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp!=0)
        {
           last= temp%10;
           sum+=Math.pow(last,digits);

           temp=temp/10;
        }
        if (sum==n)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(isArmstrong(n))
    {
        System.out.println("Armstrong");
    }
    else
        System.out.println("not Aramstrong");
}
}
