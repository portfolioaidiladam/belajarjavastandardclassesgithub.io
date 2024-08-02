package programmer.zaman.now.classes;

import java.util.UUID;
// belajar UUD ID class
// UUID adalah format standard untuk membuat unique value yang telah terjamin
// untuk kebutuhan data primary key misalnya di database
public class UUIDApp {
  public static void main(String[] args) {

    for(var i = 0; i < 100; i++){

      UUID uuid = UUID.randomUUID();
      // konversi kedalam string
      String key = uuid.toString();

      System.out.println(key);

    }

  }
}
