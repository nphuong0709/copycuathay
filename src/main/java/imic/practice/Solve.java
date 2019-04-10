package imic.practice;

import java.util.Scanner;

public class Solve
{
    public static void solve(double meal_cost, int tip_percent, int tax_percent)
    {
        double total = 0;

        total = meal_cost;
        total += meal_cost * tip_percent / 100; //total = total + meal_cost * tip_percent /100
        total += meal_cost * tax_percent / 100;


        long longTotal = Math.round(total);
        System.out.println(Math.round(longTotal));
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double total = scanner.nextDouble();
        scanner.nextLine();

        int tip_percent = scanner.nextInt();
        scanner.nextLine();

        int tax_percent = scanner.nextInt();
        scanner.nextLine();

        solve(total, tip_percent, tax_percent);
        scanner.close();
    }
}
