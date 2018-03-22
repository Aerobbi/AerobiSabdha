import java.util.Scanner;

public class NilaiSentinel {
/** Metode utama */
public static void main(String[] args) {
// Menciptakan suatu Scanner
Scanner masukan = new Scanner(System.in);

// Membaca data inisial
 System.out.print(
 "Masukkan suatu nilai int (program berhenti bila masukan adalah 0): ");
 int data = masukan.nextInt();

 // Tetap membaca sampai masukan adalah 0
 int jumlah = 0;
while (data != 0) {
	jumlah += data;

 // Membaca data selanjutnya
 System.out.print(
 "Masukkan suatu nilai int (program berhenti bila masukan adalah 0): ");
 data = masukan.nextInt();
}
 System.out.println("Jumlah adalah " + jumlah);
 }
  }