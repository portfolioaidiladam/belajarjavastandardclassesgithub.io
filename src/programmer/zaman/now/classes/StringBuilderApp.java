package programmer.zaman.now.classes;
// belajar String Builder
// fungsinya biar gak makan memory
public class StringBuilderApp {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("Eko");
    builder.append(" ");
    builder.append("Kurniawan");
    builder.append(" ");
    builder.append("Khannedy");

    String name = builder.toString();
    System.out.println(name);

  }
}
