package programmer.zaman.now.classes;
// belajar Number Class
// untuk mengkonversi ke tipe number lain
public class NumberApp {
  public static void main(String[] args) {


    Integer intValue = 10;

    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Short shortValue = doubleValue.shortValue();


    // mengkonfersi dari string ke tipe data number
    String contoh = "100.10";

    Double contohInt = Double.valueOf(contoh);
    System.out.println(contohInt);

  }
}
