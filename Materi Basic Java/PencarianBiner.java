public class PencarianBiner {
 /** Metode untuk melakukan pencarian linier */	
  
 
 
 /** Menggunakan pencarian biner untuk menemukan kunci dalam daftar */
 public static int pencarianBiner(int[] daftar, int kunci) {
 int bawah = 0;
 int atas = daftar.length - 1;

 while (atas >= bawah) {
 int tengah = (bawah + atas) / 2;
 if (kunci < daftar[tengah])
 atas = tengah - 1;
 else if (kunci == daftar[tengah])
 return tengah;
 else
 bawah = tengah + 1;
 }
 
 return -bawah - 1;// Sekarang atas < bawah, kunci tidak ditemukan
 }
 }