 import java.util.*;

 public class DemoInputMismatchException {
 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);
 boolean masukanLanjut = true;

 do {
 try {
 System.out.print("Masukkan suatu integer: ");
 int angka = masukan.nextInt();

 // Menampilkan hasil
 System.out.println(
 "Angka yang dimasukkan adalah " + angka);

 masukanLanjut = false;
 }
 catch (InputMismatchException ex) {
 System.out.println("Coba lagi. (" +
 "Masukan tidak tepat: yang dibutuhkan adalah suatu integer)");
 masukan.nextLine(); // Buang masukan
 }
 } while (masukanLanjut);
 }
 }	