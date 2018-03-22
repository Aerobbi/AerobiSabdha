 import java.util.Scanner;

 public class KonversiHexKeDesimal {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna untuk memasukkan suatu string
 System.out.print("Masukkan suatu angka heksadesimal: ");
 String hex = masukan.nextLine();

 System.out.println("Nilai desimalnya "
 + hex + " adalah "+ hexKeDesimal(hex.toUpperCase()));
 }

 public static int hexKeDesimal(String hex) {
 int nilaiDesimal = 0;
 for (int i = 0; i < hex.length(); i++) {
 char hexKar = hex.charAt(i);
 nilaiDesimal = nilaiDesimal * 16 + hexKarKeDesimal(hexKar);
 }

 return nilaiDesimal;
 }

 public static int hexKarKeDesimal(char ch) {
 if (ch >= 'A' && ch <= 'F')
 return 10 + ch - 'A';
 else // ch adalah '0', '1', ..., or '9'
 return ch - '0';
 }
 }