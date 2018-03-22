public class PengurutanPenyisipan {
	
	public static void main(String[] args) {
 double[] daftar = {1, 9, 4.5, 6.6, 5.7, -4.5};
 pengurutanPenyisipan(daftar);
 for (int i = 0; i < daftar.length - 1; i++) {
 System.out.print("  " + daftar[i]);
 }
 } 
 	
 /** Metode untuk mengurutkan angka */
 public static void pengurutanPenyisipan(double[] daftar) {
 for (int i = 1; i < daftar.length; i++) {
 /** menyisipkan daftar[i] ke dalam suatu subdaftar terurut daftar[0..i-1] 
  *  sehingga daftar[0..i] diurutkan. */
 double elemenSekarang = daftar[i];
 int k;
 for (k = i - 1; k >= 0 && daftar[k] > elemenSekarang; k--) {
 daftar[k + 1] = daftar[k];
 }

 // Menyisipkan elemen sekarang ke dalam daftar[k + 1]
 daftar[k + 1] = elemenSekarang;
 }
 }
 }