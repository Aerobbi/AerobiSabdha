 public class DemoPengikatanDinamis {
 public static void main(String[] args) {
 m(new MahasiswaPascaSarjana());
 m(new Mahasiswa());
 m(new Orang());
 m(new Object());
 }

 public static void m(Object x){
 System.out.println(x.toString());
 }
 }

 class MahasiswaPascaSarjana extends Mahasiswa{
 }

 class Mahasiswa extends Orang{
 public String toString(){
 return "Mahasiswa";
 }
 }

 class Orang extends Object{
 public String toString(){
 return "Orang";
 }
  }