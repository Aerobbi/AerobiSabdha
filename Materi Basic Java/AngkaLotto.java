import java.util.Scanner;

 public class AngkaLotto {
 public static void main(String args[]) {
 Scanner masukan = new Scanner(System.in);
 boolean[] apaDirangkum = new boolean[99]; // Default adalah false

 // Membaca semua angka dan menandai elemen terkait dirangkum
 int angka = masukan.nextInt();
 while (angka != 0) {
 apaDirangkum[angka - 1] = true;
 angka = masukan.nextInt();
 }

 // Memeriksa apa semua angka terangkum
 boolean semuaDirangkum = true; // Asumsikan semua terangkum awalnya
 for (int i = 0; i < 99; i++)
 if (!apaDirangkum[i]) {
 semuaDirangkum = false; // Mencari satu angka tidak dirangkum
 break;
 }

 // Menampilkan hasil
 if (semuaDirangkum)
 System.out.println("Tiket telah merangkum semua angka");
 else
 System.out.println("Tiket tidak merangkum semua angka");
 }
 }