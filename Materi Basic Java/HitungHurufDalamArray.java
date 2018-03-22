public class HitungHurufDalamArray {
 /** Metode Utama */
 public static void main(String[] args) {
 // Mendeklarasikan dan menciptakan suatu array
 char[] kar = ciptaArray();

 // Menampilkan array
 System.out.println("Huruf-huruf kecil adalah:");
 tampilArray(kar);

 // Menghitung perulangangan huruf 
 int[] hitung = hitungHuruf(kar);

 // Menampilkan jumlah perulangan setiap huruf
 System.out.println();
 System.out.println("Perulangan setiap karakter: ");
 tampilHitung(hitung);
 }

 /** Menciptakan suatu array karakter */
 public static char[] ciptaArray() {
 // Mendeklarasikan suatu array karakter dan menciptakannya
 char[] kar = new char[100];

 // Membangkitkan huruf-huruf kecil acak dan menugaskannya
 // kepada array kar
 for (int i = 0; i < kar.length; i++)
 kar[i] = KarakterAcak.dapatHurufKecilAcak();

 // Mengembalikan array
 return kar;
 }

 /** Menampilkan array karakter */
 public static void tampilArray(char[] kar){
 // Menampilkan karakter-karakter dalam array dengan 20 tiap baris
 for (int i = 0; i < kar.length; i++) {
 if ((i + 1) % 20 == 0)
 System.out.println(kar[i]);
else
 System.out.print(kar[i] + " ");
 }
 }

 /** Menghitung perulangan setiap karakter */
 public static int[] hitungHuruf(char[] kar) {
 // Mendeklarasikan dan menciptakan suatu array yang memuat 26 int
 int[] hitung = new int[26];

 // Untuk tiap huruf kecil dalam array, dihitung perulangannya
 for (int i = 0; i < kar.length; i++)
 hitung[kar[i] - 'a']++;

 return hitung;
 }

 /** Menampilkan perulangan */
 public static void tampilHitung(int[] hitung){
 for (int i = 0; i < hitung.length; i++) {
 if ((i + 1) % 10 == 0)
 System.out.println(hitung[i] + " " + (char)(i + 'a'));
 else
 System.out.print(hitung[i] + " " + (char)(i + 'a') + " ");
 }
 }
 }