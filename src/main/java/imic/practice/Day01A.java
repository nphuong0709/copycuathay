package imic.practice;

import java.util.Scanner;

public class Day01A
{

  public static void main(String[] args)
  {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);
    int line1 = Integer.parseInt(scan.nextLine());
    double line2 = Double.parseDouble(scan.nextLine());
    String line3 = scan.nextLine();

    //Do request:
    line1 = line1 + i;
    line2 = line2 + d;
    line3 = s + line3;

    System.out.println(line1);
    System.out.println(line2);
    System.out.println(line3);

    scan.close();
  }
}