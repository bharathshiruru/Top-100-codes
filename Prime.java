import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        CheckPrime(n);
    }

    public static void CheckPrime(int n) {
        int count = 0;

        if (n < 2) {
            System.out.println(n + " is not a prime number");
        }
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                count = count + 1;
            }

        if (count > 2) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }


    }
}

