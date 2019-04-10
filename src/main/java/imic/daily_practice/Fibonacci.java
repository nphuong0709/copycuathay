package imic.daily_practice;

public class Fibonacci {
    public static int tinhFibonacci(int n) {
        int Fn = 0;
        int F1 = 1;
        int F2 = 1;

        if (n == 1) {
            Fn = F1;
            System.out.println(Fn);
        } else if (n > 2) {
            Fn = F1;
            Fn += (n-2);// Fn = Fn + F2 = 1 + 1
            System.out.println(Fn);

        }
        return Fn;
    }
}

