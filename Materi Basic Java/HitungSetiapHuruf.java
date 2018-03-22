import java.util.Scanner;

 public class HitungSetiapHuruf {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan suatu string
 System.out.print("Masukkan suatu string: ");
 String s = masukan.nextLine();

 // Memanggil metode hitungHuruf untuk menghitung setiap huruf
 int[] hitung = hitungHuruf(s.toLowerCase());

 // Menampilkan hasil
 for (int i = 0; i < hitung.length; i++) {
 if (hitung[i] != 0)
 System.out.println((char)('a' + i) + " muncul " +
 hitung[i] + " kali" );
 }
 }

 /** Menghitung setiap huruf di dalam string */
 public static int[] hitungHuruf(String s) {
 int[] hitung = new int[26];

 for (int i = 0; i < s.length(); i++) {
 if(Character.isLetter(s.charAt(i)))
 hitung[s.charAt(i) - 'a']++;
 }

 return hitung;
 }
 }