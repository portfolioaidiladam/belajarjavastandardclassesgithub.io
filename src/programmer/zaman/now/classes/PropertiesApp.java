package programmer.zaman.now.classes;

import java.io.*;
import java.util.Properties;
// belajar properties class
// bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
public class PropertiesApp {
  public static void main(String[] args) {
     // ini untuk ngeload
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("application.properties"));

      String host = properties.getProperty("database.host");
      String port = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);

    } catch (FileNotFoundException exception) {
      System.out.println("File tidak ketemu");
    } catch (IOException exception) {
      System.out.println("Gagal load data dari file");
    }

    // kita pengen nyimpen data ke properties
    try {
      Properties properties = new Properties();
      properties.put("name.first", "Eko");
      properties.put("name.middle", "Kurniawan");
      properties.put("name.last", "Khannedy");

      properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
    } catch (FileNotFoundException exception) {
      System.out.println("Error membuat file properties");
    } catch (IOException exception) {
      System.out.println("Error menyimpan properties");
    }

  }
}
