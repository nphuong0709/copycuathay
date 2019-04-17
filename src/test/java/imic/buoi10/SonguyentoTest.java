package imic.buoi10;

import org.junit.Test;

public class SonguyentoTest {

    @Test
    public void checkSoNguyenToTest() {
         boolean ketQua = Songuyento.checkSoNguyenTo(89);
         assert ketQua == true : "Error";


    }

  @Test
    public void lietkeSoNguyenTo() {
        boolean ketQua = Songuyento.lietkeSoNguyenTo(100);
    }
}