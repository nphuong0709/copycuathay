package imic.daily_practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class UocBoiTest {

    @Test
    public void tinhUocn() {
        int n = 12;
        int ketQua = UocBoi.tinhUocn(n);
        System.out.println(ketQua);
    }

    @Test
    public void tinhUocHaiso() {
        int ketQua = UocBoi.tinhUocHaiso(12,9);
    }
}