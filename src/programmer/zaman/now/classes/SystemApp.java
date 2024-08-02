package programmer.zaman.now.classes;
// belajar system class
// class yang berisikan banyak utility static method di Java
public class SystemApp {
  public static void main(String[] args) {
    // pengen dapet timemilles dan nano secoun
    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
    // pengen dapan environment
    System.out.println(System.getenv("HOME"));
    System.out.println(System.getenv("APP"));
    // buat ngerunning garbadge collection
    System.gc();
    // ini untuk menghentikan program
    System.exit(1);

    System.out.println("Hi");

  }
}
