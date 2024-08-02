package programmer.zaman.now.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

// belajar Big Number Class
//  menggunakan angka yang besar sehingga melebihi kapasitas Long dan Double,
//  di Java sudah disediakan class untuk handle data besar tersebut

public class BigNumberApp {
  public static void main(String[] args) {

    BigInteger a = new BigInteger("10000000000000000000");
    BigInteger b = new BigInteger("10000000000000000000");

    BigInteger c = a.add(b);

    System.out.println(c);

  }
}
