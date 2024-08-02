package programmer.zaman.now.classes;

import java.util.Random;
// belajar random class
// class yang bisa kita gunakan untuk men-generate random number

public class RandomApp {
  public static void main(String[] args) {

    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
      int value = random.nextInt(1000);
      System.out.println(value);
    }

  }
}
