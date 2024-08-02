package programmer.zaman.now.classes;

import java.util.StringTokenizer;

// belajar String Tokenizer
// yang bisa digunakan untuk memotong String menjadi token / string yang lebih kecil lebih menghemat memory
public class StringTokenizerApp {
  public static void main(String[] args) {

    String value = "Eko Kurniawan Khannedy";

    StringTokenizer tokenizer = new StringTokenizer(value, " ");

    while(tokenizer.hasMoreTokens()){
      String result = tokenizer.nextToken();
      System.out.println(result);
    }

  }
}
