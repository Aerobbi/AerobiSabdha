 import java.util.Scanner;

 public class PalindromeAbaikanNonAlfanumerik {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan suatu string
 System.out.print("Masukan suatu string: ");
 String s = masukan.nextLine();

 // Menampilkan hasil
 System.out.println("Mengabaikan karakter-karakter alfanumerik, \napakah "
 + s + " suatu palindrome? " + apaPalindrome(s));
 }

 /** Mengembalikan true bila suatu string adalah palindrome */
 public static boolean apaPalindrome(String s) {
 // Menciptakan suatu string baru dengan menghapus karakter-karakter nonalfanumerik
 String s1 = filter(s);

 // Menciptakan suatu string baru yang berkebalikan dari s1
 String s2 = balik(s1);

 // Membandingkan jika string terbalik sama dengan string asli
 return s2.equals(s1);
 }

 /** Menciptakan suatu string baru dengan menghapus karakter-karakter nonalfanumerik */
 public static String filter(String s) {
 // Menciptakan suatu string builder
 StringBuilder stringBuilder = new StringBuilder();

 // Memeriksa setiap char di dalam string
 for (int i = 0; i < s.length(); i++) {
 if(Character.isLetterOrDigit(s.charAt(i))) {
 stringBuilder.append(s.charAt(i));
 }
 }

 // Mengembalikan suatu string terfilter yang baru
 return stringBuilder.toString();
 }

 /** Menciptakan suatu string baru dengan membalikkan string tertentu */
 public static String balik(String s) {
 StringBuilder stringBuilder = new StringBuilder(s);
 stringBuilder.reverse();// Memanggil metoder reverse dalam StringBuilder
 return stringBuilder.toString();
 }
 }