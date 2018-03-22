public class PengurutanSeleksi {
 
 public static void main(String[] args) {
 double[] daftar = {1, 9, 4.5, 6.6, 5.7, -4.5};
 pengurutanSeleksi(daftar);
 for (int i = 0; i < daftar.length - 1; i++) {
 System.out.print("  " + daftar[i]);
 }
 }
 
 /** Metode untuk mengurutkan angka */
 public static void pengurutanSeleksi(double[] daftar) {
 for (int i = 0; i < daftar.length - 1; i++) {
 // Menemukan terkecil dalam[i sampai daftar.length-1]
 double minSekarang = daftar[i];
 int indeksMinSekarang = i;

 for (int j = i + 1; j < daftar.length; j++) {
 if (minSekarang > daftar[j]) {
 minSekarang = daftar[j];
 indeksMinSekarang = j;
 }
 }

 // Menukar daftar[i] dengan daftar[indeksMinSekarang] jika diperlukan;
 if (indeksMinSekarang != i) {
 daftar[indeksMinSekarang] = daftar[i];
 daftar[i] = minSekarang;
 }
 }
 }
 }