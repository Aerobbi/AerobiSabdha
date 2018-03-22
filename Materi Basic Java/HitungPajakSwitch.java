import java.util.Scanner;

public class HitungPajakSwitch {
   public static void main(String[] args) {
     // Menciptakan suatu Scanner
     Scanner masukan = new Scanner(System.in);

     // Meminta pengguna untuk memasukkan status kategori
     System.out.print(
      "(0-tidak kawin, 1-kawin bersama,\n" +
      "2-kawin terpisah, 3-kepala keluarga)\n" +
      "Masukkan status kategori: ");
     int status = masukan.nextInt();

     // Meminta pengguna untuk memasukkan pendapatan tahunan
     System.out.print("Masukkan pendapatan tahunan ( x Rp. 10.000): ");
     double pendapatan = masukan.nextDouble();

     // Hitung pajak
     double pajak = 0;
 
     switch (status) {
       case 0: { //hitung pajak untuk kategori tidak kawin
       if (pendapatan <= 8350)
         pajak = pendapatan * 0.10;
       else if (pendapatan <= 33950)
         pajak = 8350 * 0.10 + (pendapatan - 8350) * 0.15;
       else if (pendapatan <= 82250)
         pajak = 8350 * 0.10 + (33950 - 8350) * 0.15 +
         (pendapatan - 33950) * 0.25;
       else if (pendapatan <= 171550)
         pajak = 8350 * 0.10 + (33950 - 8350) * 0.15 +
         (82250 - 33950) * 0.25 + (pendapatan - 82250) * 0.28;
       else if (pendapatan <= 372950)
         pajak = 8350 * 0.10 + (33950 - 8350) * 0.15 +
         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
         (pendapatan - 171550) * 0.35;
       else
         pajak = 8350 * 0.10 + (33950 - 8350) * 0.15 +
         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
         (372950 - 171550) * 0.33 + (pendapatan - 372950) * 0.35;
       }
       break;
       case 1: { //hitung pajak untuk kategori menikah bersama
         // Untuk latihan pemrograman
       }
       break;
       case 2: { // hitung pajak untuk kategori menikah terpisah
         // Untuk latihan pemrograman
       break;
       }
       
       case 3: { //hitung pajak untuk kategori kepala keluarga
         // Untuk latihan pemrograman
       }
       break;
       default: System.out.println("Error: status tidak valid");
       System.exit(0);
       }
   // Tampilkan hasil
   System.out.println("Pajak sebesar Rp. " + (int)(pajak * 100) / 100.0  
   + "(x Rp. 10.000)" );
   }
}
