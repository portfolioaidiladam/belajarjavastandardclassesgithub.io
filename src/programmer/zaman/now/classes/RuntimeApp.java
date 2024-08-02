package programmer.zaman.now.classes;
// belajar runtime class
// Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object.
// Kita bisa mengakses  object  tersebut menggunakan static method getRuntime() milik class Runtime

public class RuntimeApp {
  public static void main(String[] args) {

    Runtime runtime = Runtime.getRuntime();
    // mendapatkan jumlah core CPU
    System.out.println(runtime.availableProcessors());
    // mendapatkan jumlah memory bebas di JVM
    System.out.println(runtime.freeMemory());
    // Mendapatkan jumlah total memory di JVM
    System.out.println(runtime.totalMemory());
    //Mendapatkan jumlah maksimum memory di JVM
    System.out.println(runtime.maxMemory());
  }
}
