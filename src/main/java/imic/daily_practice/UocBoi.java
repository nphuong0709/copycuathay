package imic.daily_practice;

public class UocBoi {
    public static int tinhUocn(int n) {
        int uocLonNhat = 1;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i > uocLonNhat) {
                    uocLonNhat = i;
                }
            }

        }
        return uocLonNhat;
    }

    public static int tinhUocHaiso(int a, int b) {
        int uocHaiso = 1;

        for (int i = 1; i < a; i++) {
            if (a % i == 0){
                System.out.println(i);

                if (b % i == 0){
                    System.out.println(i);
                }
            }
        }
        return uocHaiso;
    }
}
