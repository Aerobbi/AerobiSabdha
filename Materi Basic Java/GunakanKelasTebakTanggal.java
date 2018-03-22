 import java.util.Scanner;

 public class GunakanKelasTebakTanggal {
 public static void main(String[] args) {
 int tanggal = 0; // Tanggal yang akan ditentukan
 int jawaban;

 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 for (int i = 0; i < 5; i++) {
 System.out.println("Apakah ultah Anda dalam himpunan" + (i + 1) + "?");
 for (int j = 0; j < 4; j++) {
 for (int k = 0; k < 4; k++)
 System.out.print( TebakTanggal.dapatNilai(i, j, k) + " ");
 System.out.println();
 }

 System.out.print("\nMasukkan o untuk Tidak dan 1 Untuk Ya: ");
 jawaban = masukan.nextInt();

 if (jawaban == 1)
 tanggal += TebakTanggal.dapatNilai(i, 0, 0);
 }

 System.out.println("Hari Ultah Anda adalah " + tanggal);
 }
 }