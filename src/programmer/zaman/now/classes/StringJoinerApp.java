package programmer.zaman.now.classes;

import java.util.StringJoiner;

// belajar String Joiner
// fungsinya Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau

public class StringJoinerApp {
  public static void main(String[] args) {

    StringJoiner joiner = new StringJoiner(", ", "{", "}");

    joiner.add("Eko");
    joiner.add("Kurniawan");
    joiner.add("Khannedy");

    String value = joiner.toString();
    System.out.println(value);

  }
}
