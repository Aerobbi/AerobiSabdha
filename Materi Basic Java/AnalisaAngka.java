public class AnalisaAngka {
 public static void main(String[] args) {
 final int JUMLAH_ELEMEN = 5;
 double[] angka = new double[JUMLAH_ELEMEN];

 double jumlah = 0;

 java.util.Scanner masukan = new java.util.Scanner(System.in);
 for (int i = 0; i < JUMLAH_ELEMEN; i++) {
 System.out.print("Masukkan suatu angka baru: ");
 angka[i] = masukan.nextDouble();

 jumlah += angka[i];
 }


 double rerata = jumlah / JUMLAH_ELEMEN;

 int hitung = 0; // Jumlah elemen di atas rerata
 for (int i = 0; i < JUMLAH_ELEMEN; i++)
 if (angka[i] > rerata)
 hitung++;

 System.out.println("Rerata adalah " + rerata);
 System.out.println("Jumlah elemen di atas rerata adalah "
 + hitung);
 }
 }