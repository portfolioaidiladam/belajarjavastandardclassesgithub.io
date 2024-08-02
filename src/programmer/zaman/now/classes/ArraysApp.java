package programmer.zaman.now.classes;

import java.util.Arrays;
// belajar array class
// class yang berisikan static method yang bisa kita gunakan untuk memanipulasi data array,
// seperti pencarian dan pengurutan

public class ArraysApp {
  public static void main(String[] args) {

    int[] numbers = {
        1, 4, 234, 5, 6, 19, 5, 67, 4, 5, 67, 4, 6, 7
    };

    Arrays.sort(numbers);
    // pengen mengembalikan representasi string
    System.out.println(Arrays.toString(numbers));
    // pengen mencari value di array
    System.out.println(Arrays.binarySearch(numbers, 7));
    System.out.println(Arrays.binarySearch(numbers, 234));
    System.out.println(Arrays.binarySearch(numbers, 100));
    // pengen menyalin data array dengan kondisi panjangnya berapa
    int[] result = Arrays.copyOf(numbers, 5);
    System.out.println(Arrays.toString(result));
    // pengen menyalin data array dari berapa sampe berapa
    int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
    System.out.println(Arrays.toString(result2));

  }
}
