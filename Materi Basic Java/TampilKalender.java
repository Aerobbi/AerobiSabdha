import java.util.Scanner;

public class TampilKalender {
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
    // Menampilkan kepala kalender
    tampilJudulBulan(tahun, bulan);
    
    // Menampilkan tubuh kalender
    tampilTubuhBulan(tahun, bulan);
  }

  /** Konsep implementasi tampilJudulBulan */
  public static void tampilJudulBulan (int tahun, int bulan)
  {
  System.out.println(" " + dapatNamaBulan(bulan)
 + " " + tahun);
 System.out.println("—————————————————————————————-———-———-———-——");
 System.out.println(" Minggu Senin Selasa Rabu Kamis Jumat Sabtu");
  }

  /** Konsep implementasi dapatTubuhBulan */
  public static void tampilTubuhBulan(int tahun, int bulan)
  {
  	// Mendapatkan hari awal tanggal pertama tiap bulan
  	int hariMulai = dapatHariMulai(tahun, bulan);
  	
  	// Get number of days in the month
 int jumlahHariDalamSebulan = dapatJlhHariDalamSebulan(tahun, bulan);
  
  // Padding spasi sebelum hari pertama tiap bulan
 int i = 0;
 for (i = 0; i < hariMulai; i++)
 System.out.print("      ");

 for (i = 1; i <= jumlahHariDalamSebulan; i++) {
 System.out.printf("%6d", i);

 if ((i + hariMulai) % 7 == 0)
 System.out.println();
 }

 System.out.println();
 }


  /** Konsep implementasi dapatNamaBulan */
  public static String dapatNamaBulan(int bulan) {
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
    final int HARI_MULAI_JAN_1_1800 = 3;
 // Mendapatkan total jumlah hari sejak 1/1/1800 ke bulan/1/tahun
 int totalJumlahHari = dapatTotalJumlahHari(tahun, bulan);

 // Kembali ke hari awal bulan/1/tahun
 return (totalJumlahHari + HARI_MULAI_JAN_1_1800) % 7;
 }
  

  /** Konsep implementasi dapatTotalJumlahHari */
  public static int dapatTotalJumlahHari(int tahun, int bulan)
  {
    int total = 0;

 // Mendapatkan total hari dari 1800 sampai 1/1/year
 for (int i = 1800; i < tahun; i++)
 if (apaTahunLeap(i))
 	total = total + 366;
 else
 total = total + 365;

 // Menambahkan hari dari Jan sampai bulan yang diminta
 for (int i = 1; i < bulan; i++)
 total = total + dapatJlhHariDalamSebulan(tahun, i);

 return total;
 }
  

  /** Konsep implementasi dapatJlhHariDalamSebulan */
  public static int dapatJlhHariDalamSebulan(int tahun, int bulan)
  {
    if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 ||
 bulan == 8 || bulan == 10 || bulan == 12)
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
