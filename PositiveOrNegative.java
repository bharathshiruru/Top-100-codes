import java.util.Scanner;

    public class PositiveOrNegative {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int num=sc.nextInt();
            if(num>0)
            {
                System.out.println("the number is positive");
            }
            else if (num==0)
            {
                System.out.println("The number is neither positive nor negative");
            }
            else
            {
                System.out.println("the number is negative");
            }
        }
    }


