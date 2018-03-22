import java.util.Scanner;

 public class KonversiDesimal2Hex {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan suatu angka desimal
 System.out.print("Masukkan suatu angka desimal: ");
 int desimal = masukan.nextInt();

 System.out.println("Angka desimal untuk angka desimal " +
desimal + " adalah " +desimalKeHex(desimal) );
 }

 /** Mengkonversi suatu desimal menjadi heksadesimal sebagai suatu string */
 public static String desimalKeHex(int desimal) {
 String hex = "";

 while (desimal != 0) {
 int nilaiHex = desimal % 16;
 hex =keHexChar(nilaiHex) + hex;
 desimal = desimal / 16;
 }

 return hex;
 }

 /** Mengkonversi suatu integer menjadi satu dijit hex dalam karakter */
 public static char keHexChar(int nilaiHex) {
 if (nilaiHex <= 9 && nilaiHex >= 0)
 return (char)(nilaiHex + '0');
 else // nilaiHex <= 15 && nilaiHex >= 10
 return (char)(nilaiHex - 10 + 'A');
 }
 }