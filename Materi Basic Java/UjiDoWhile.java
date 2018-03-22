import java.util.Scanner;

public class UjiDoWhile {
  /** Metode utama */
  public static void main(String[] args) {
int data;
int jumlah = 0;

// Menciptakan suatu Scanner
Scanner masukan = new Scanner(System.in);

// Tetap membaca sampai masukan adalah 0
   do {
   
      // Membaca data selanjutnya
      System.out.print(
       "Masukkan suatu nilai int (program berhenti bila masukan adalah 0): ");
      data = masukan.nextInt();
      jumlah += data;
    }
    while (data != 0);
    System.out.println("Jumlah adalah " + jumlah);
  }
}

