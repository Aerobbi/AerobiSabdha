import java.util.Scanner;

 public class MelewatkanArrayDuaDimensi {
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Masukkan nilai-nilai array
 int[][] m = new int[3][4];
 System.out.println("Masukkan " + m.length + " baris dan "
 + m[0].length + " kolom: ");
 for (int i = 0; i < m.length; i++)
 for (int j = 0; j < m[i].length; j++)
 m[i][j] = masukan.nextInt();

 // Tampilkan hasil
 System.out.println("\nPenjumlahan semua elemen matriks adalah " +jum(m) );
 }

 public static int jum(int[][] m) {
 int total = 0;
 for (int baris = 0; baris < m.length; baris++) {
 for (int kolom = 0; kolom < m[baris].length; kolom++) {
 total += m[baris][kolom];
 }
 }

 return total;
 }
 }