import java.util.Scanner;

 public class PeriksaPalindrome {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan suatu string
 System.out.print("Masukkan suatu string: ");
 String s = masukan.nextLine();

 if(apaPalindrome(s) )
 System.out.println(s + " adalah suatu palindrome");
 else
 System.out.println(s + " bukan suatu palindrome");
 }

 /** Memeriksa apakah suatu string adalah suatu palindrome */
 public static boolean apaPalindrome( String s) {
 // Indeks pertama dalam string
 int bawah = 0;

 // Indeks terkahir string
 int atas = s.length()- 1;

 while (bawah < atas) {
 if(s.charAt(bawah) != s.charAt(atas))
 return false; // Bukan suatu palindrome

 bawah++;
 atas--;
 }

 return true; // The string is a palindrome
 }
 }