import java.util.Scanner;

public class TampilKalender1 {
  /** Metode utama */
  public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
 
    // Meminta pengguna memasukkan tahun
    System.out.print("Masukkan tahun (misalnya, 2001): ");
    int tahun = masukan.nextInt();

    // Meminta pengguna memasukkan bulan
    System.out.print("Masukkan bulan antara 1 sampai 12: ");
    int bulan = masukan.nextInt();

    // Menampilkan kalender untuk bulan dan tahun yang diminta
    tampilBulan(tahun, bulan);
  }

  /** Konsep implementasi tampilBulan */
  public static void tampilBulan(int tahun, int bulan){
    System.out.print(bulan + " " + tahun);
  }

  /** Konsep implementasi tampilJudulBulan */
  public static void tampilJudulBulan (int tahun, int bulan)
  {
  }

  /** Konsep implementasi dapatTubuhBulan */
  public static void dapatTubuhBulan(int tahun, int bulan)
  {
  }

  /** Konsep implementasi dapatNamaBulan */
  public static String dapatNamaBulan(int bulan)
  {
   String namaBulan = " ";
    switch (bulan) {
 case 1: namaBulan = "Januari"; break;
 case 2: namaBulan = "pebruari"; break;
 case 3: namaBulan = "Maret"; break;
 case 4: namaBulan = "April"; break;
 case 5: namaBulan = "Mei"; break;
 case 6: namaBulan = "Juni"; break;
 case 7: namaBulan = "Juli"; break;
 case 8: namaBulan = "Agustus"; break;
 case 9: namaBulan = "September"; break;
 case 10: namaBulan = "Oktober"; break;
 case 11: namaBulan = "Nopember"; break;
 case 12: namaBulan = "Desember";
 }

 return namaBulan; 
  }

  /** Konsep implementasi dapatHariMulai */
  public static int dapatHariMulai(int tahun, int bulan)
  {
    return 1; 
  }

  /** Konsep implementasi dapatTotalJumlahHari */
  public static int dapatTotalJumlahHari(int tahun, int bulan)
  {
    return 10000; 
  }

  /** Konsep implementasi dapatJlhHariDalamSebulan */
  public static int dapatJlhHariDalamSebulan(int tahun, int bulan)   {
    if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12)
       return 31;

 if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) 
   return 30;

 if (bulan == 2) return apaTahunLeap(tahun) ? 29 : 28;

 return 0; // Jika bulan tidak benar
 } 
 

  /** Konsep implementasi apaTahunLeap */
  public static boolean apaTahunLeap(int tahun)
  {
     return tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0); 
  }
}
