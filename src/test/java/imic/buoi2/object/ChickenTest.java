package imic.buoi2.object;

import org.junit.Test;


/**
 * Unit test for simple Chicken.
 */
public class ChickenTest
{

  public static void helpMeSomething()
  {

  }

  @Test
  public void test2ConGa()
  {
    Chicken chicken1 = new Chicken("TieuBao");
    Chicken chicken2 = new Chicken("TieuHong");

    chicken1.chipchip();
    chicken2.chipchip();
  }

  @Test
  public void testFunctions()
  {
    Chicken chicken1 = new Chicken();
    Chicken.coBaoNhieuChan();

    chicken1.coBaoNhieuChan();
    chicken1.chipchip();
  }
}
