package imic.buoi10;

/**
 *  Viết chương trình kiểm tra số n có phải là số ngyên tố.
 *   * INPUT: số n
 *   * OUTPUT: return boolean: true/false
 *   Số nguyên tố là số chia hết cho 1 và chính nó
 */
public class Songuyento {
    public static boolean checkSoNguyenTo(int n) {
        boolean soN;
        if (n % 1 == 0 && n % n == 0) { //n=4; 4%1 =4 && 4%4 =1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    
    public static boolean lietkeSoNguyenTo(int n) {
        int ketQua;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {

                return false;
            }
        }
        ketQua = n;
        System.out.println(ketQua);
        return true;




        }


}
