package imic.buoi9;

import org.junit.Test;

public class LoopTest {

    @Test
    public void doSomethingwithWhile() {
        Loop.doSomethingwithWhile();
    }

    @Test
    public void doSomethingwithContinue()
    {
        Loop.doSomethingwithContinue();
    }

    @Test
    public void doSomethingwithFor() {
        Loop.doSomethingwithFor();
    }

    @Test
    public void tinhGiaithua() {
        int n = 2;
        int ketQua;
        ketQua = Loop.tinhGiaithua(n);
        System.out.println(ketQua);
    }
}