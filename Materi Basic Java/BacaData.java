 import java.util.Scanner;

 public class BacaData {
 public static void main(String[] args) throws Exception {
 // Menciptakan suatu instans File
 java.io.File file = new java.io.File("skor.txt");

 // Menciptakan suatu Scanner untuk file
 Scanner masukan = new Scanner(file);

 // Membaca data dari file
 while (masukan.hasNext()) {
 String namaPertama = masukan.next();
 String namaTengah = masukan.next();
 String namaAkhir = masukan.next();
 int score = masukan.nextInt();
 System.out.println(
 namaPertama + " " + namaTengah + " " + namaAkhir + " " + score);
 }

 // Menutup file
 masukan.close();
 }
 }