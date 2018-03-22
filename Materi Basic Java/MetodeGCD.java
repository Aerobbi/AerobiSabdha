import java.util.Scanner;

 public class MetodeGCD {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan dua integer
 System.out.print("Masukkan integer pertama: ");
 int n1 = masukan.nextInt();
 System.out.print("Masukkan integer kedua: ");
 int n2 = masukan.nextInt();

 System.out.println("GCD atas " + n1 +
" dan " + n2 + " adalah " +gcd(n1, n2));
}

 /** Memberikan nilai balik gcd atas dua integer */
public static int gcd(int n1, int n2) {
	int gcd = 1; // gcd awal = 1
 int k = 2; // gcd yang mungkin

 while (k <= n1 && k <= n2) {
 if (n1 % k == 0 && n2 % k == 0)
 gcd = k; // Perbarui gcd
 k++;
 }
return gcd;  // Memberikan nilai balik gcd
}
}