import java.util.Scanner;

 public class TahunLeap {
 public static void main(String[] args) {
 // Menciptakan suatu Scanner
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan suatu tahun: ");
 int tahun = masukan.nextInt();

 // Periksa apakah tahun leap atau bukan
 boolean apaTahunLeap =
 (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

 // Tampilkan hasil
 System.out.println(tahun + " apakah tahun leap? " + apaTahunLeap);
 }
 }