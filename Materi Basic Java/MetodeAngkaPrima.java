public class MetodeAngkaPrima {
 public static void main(String[] args) {
 System.out.println("50 angka prima pertama adalah \n");
 cetakAngkaPrima(50);
 }

 public static void cetakAngkaPrima(int angkaPrima) {
 final int JUMLAH_ANGKA_PRIMA_PER_BARIS = 10; // Menampilkan 10 per baris
 int hitung = 0; // Menghitung jumlah angka prima
 int angka = 2; // Angka yang akan diuji keprimaannya

 // Secara berulang menemukan angka-angka prima
 while (hitung < angkaPrima) {
 // Menampilkan angka prima dan menambah hitung
 if( apaPrima(angka)) {
 hitung++; // Menambah hitung

 if (hitung % JUMLAH_ANGKA_PRIMA_PER_BARIS == 0) {
 //Menampilkan angka prima dan mengganti baris
 System.out.printf("%-5s\n", angka);
 }
 else
 System.out.printf("%-5s", angka);
 }

 // Memeriksa apakah angka berikutnya adalah prima
 angka++;
 }
 }

 /** Memeriksa apakah suatu angka prima atau tidak */
 public static boolean apaPrima(int angka) {
 for (int pembagi = 2; pembagi <= angka / 2; pembagi++) {
 if (angka % pembagi == 0) { // Jika true, angka bukan prima
 return false; // angka bukan prima
 }
 }

 return true; // angka prima
 }
 }