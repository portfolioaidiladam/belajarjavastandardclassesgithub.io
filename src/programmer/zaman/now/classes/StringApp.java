package programmer.zaman.now.classes;
// belajar String classs
public class StringApp {
  public static void main(String[] args) {

    String name = "Eko Kurniawan Khannedy";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();


    System.out.println(name);
    System.out.println(nameLowercase);
    System.out.println(nameUppercase);
    System.out.println(name.length());
    System.out.println(name.startsWith("Eko"));
    System.out.println(name.endsWith("Khannedy"));
    // pengen motong String karakter
    String[] names = name.split(" ");
    for(var value : names){
      System.out.println(value);
    }
    // mengecek apakah dia blank atau engga
    System.out.println(" ".isBlank());
    // ngecek apakah string kosong
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());

    // kalau mau ngambil karakter keberapa
    System.out.println(name.charAt(0));
    // mengubah nama menjadi karakter
    char[] chars = name.toCharArray();

  }
}
