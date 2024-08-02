package programmer.zaman.now.classes;

import java.util.Base64;
// belajar base 64 class
//encoding yang bisa digunakan untuk mengubah binary data ke text yang aman dari kesalahan parsing bukan dari sisi security
public class Base64App {
  public static void main(String[] args) {

    String original = "Eko Kurniawan Khannedy";
    // mengencoder data stringya jadi base 64, dan mengkonversi string ini menjadi byte array
    String encoded = Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println(encoded);
    // membalikan ke data aslinya
    byte[] bytes = Base64.getDecoder().decode(encoded);
    String result = new String(bytes);

    System.out.println(result);

  }
}
