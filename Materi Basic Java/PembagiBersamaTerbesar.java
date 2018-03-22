import java.util.Scanner;

 public class PembagiBersamaTerbesar {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

// Meminta pengguna memasukkan dua integer
 System.out.print("Masukkan integer positif pertama: ");
 int n1 = masukan.nextInt();
 System.out.print("Masukkan integer positif kedua: ");
  int n2 = masukan.nextInt();
  
  int gcd = 1; // nilai awal gcd
  int k = 2;   // gcd yang mungkin
  while (k <= n1 && k <= n2) {
  	if (n1 % k == 0 && n2 % k == 0)
  		gcd = k; // Update gcd
 k++;
 }

 System.out.println("Pembagi Bersama Terbesar untuk " + n1 +
 " dan " + n2 + " adalah " + gcd);
 }
 }
  
  