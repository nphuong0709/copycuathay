package imic.buoi9;

public class Loop {
    public static void doSomethingwithWhile() {
        String myName = "nPhuong";
        System.out.println(myName);

        int x = 0;
        while (x < 10) {
            System.out.println(myName);
        }
    }

    public static void doSomethingwithContinue() {
        String myName = "Phuong";

        int x = 10;
        while (x % 2 != 0) {
            x++;
            continue;
        }
        System.out.println(myName);
        x++;
    }

    public static void doSomethingwithFor() {

        for (int x = 15; x <= 100; x++) {
            if (x % 10 == 7) {

                System.out.println(x);
            }

        }
    }

    public static int tinhGiaithua(int n) {
        int ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua = ketQua * i;
        }
        return ketQua;
    }


}
