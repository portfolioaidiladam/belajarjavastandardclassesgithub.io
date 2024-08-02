package programmer.zaman.now.classes;

import java.util.Objects;
// belajar object class
// class utility yang berisikan banyak static method yang bisa kita gunakan
// untuk operasi object atau melakukan pengecekan sebelum operasi nya dilakukan

public class ObjectsApp {

  public static class Data {

    private String data;
    // kita bikin constructor
    public Data(String data) {
      this.data = data;
    }
    // kita bikin getter setternya
    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }
    // kita bikin override equal dan hascodenya  di generate fn +alt + delete
    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Data data1 = (Data) o;

      return data != null ? data.equals(data1.data) : data1.data == null;
    }

    @Override
    public int hashCode() {
      return data != null ? data.hashCode() : 0;
    }

    // kita overide to string
    @Override
    public String toString() {
      return "Data{" +
          "data='" + data + '\'' +
          '}';
    }
  }

  public static void main(String[] args) {

    execute(null);
    execute(new Data("Aidil"));

  }

  public static void execute(Data data){


      System.out.println(Objects.toString(data));
      System.out.println(Objects.hashCode(data));

  }
}
