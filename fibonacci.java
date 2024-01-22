import java.util.Scanner;
public class fibonacci {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("0,1,");

        int last;
        for(int i=2;i<n;i++)
        {
            last=a+b;
            a=b;
            b=last;
            System.out.print(last+", ");
        }

    }
}
