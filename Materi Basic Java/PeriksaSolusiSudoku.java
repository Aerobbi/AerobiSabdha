import java.util.Scanner;

 public class PeriksaSolusiSudoku {
 public static void main(String[] args) {
 // Membaca suatu solusi Sudoku
 int[][] grid = bacaSolusi();

 System.out.println( apaValid(grid)? "Solusi valid" :
 "Solusi tidak valid");
 }

 /** Membaca solusi Sudoku dari konsol */
 public static int[][] bacaSolusi() {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);
System.out.println("Masukkan solusi teka-teki Sudoku:");
 int[][] grid = new int[9][9];
 for (int i = 0; i < 9; i++)
 for (int j = 0; j < 9; j++)
 grid[i][j] = masukan.nextInt();

 return grid;
 }

 /** Memeriksa apakah solusi valid */
 public static boolean apaValid(int[][] grid) {
 // Memeriksa apakah setiap baris memiliki angka 1 sampai 9
 for (int i = 0; i < 9; i++)
 if(!apa1Ke9(grid[i]) ) // If grid[i] does not contain 1 to 9
 return false;

 // Memeriksa apakah setiap kolom memiliki angka 1 sampai 9
 for (int j = 0; j < 9; j++) {
 // Mendapatkan satu kolom dalam array satu dimensi
 int[] kolom = new int[9];
 for (int i = 0; i < 9; i++) {
 kolom[i] = grid[i][j];
 }

 if(!apa1Ke9(kolom) ) // If column does not contain 1 to 9
 return false;
 }

 // Memeriksa apakah kotak 3 x 3 memiliki 1 sampai 9
 for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
 // Elemen awal dalam kotak 3 x 3
 int k = 0;
 int[] daftar = new int[9]; // Menempatkan semua angka dalam kotak kepada daftar
 for (int baris = i * 3; baris < i * 3 + 3; baris++)
 for (int kolom = j * 3; kolom < j * 3 + 3; kolom++)
 daftar[k++] = grid[baris][kolom];

 if(!apa1Ke9(daftar) ) // Jika daftar tidak memuat angka 1 sampai 9
 return false;
 }
 }

 return true; // Sel-sel valid
 }

 /** Memeriksa apakah array satu dimensi memuat angka 1 sampai 9 */
 public static boolean apa1Ke9(int[] daftar) {
 // Membuat suatu salinan dari array
 int[] temp = new int[daftar.length];
 System.arraycopy(daftar, 0, temp, 0, daftar.length);

 // Mengurutkan array
 java.util.Arrays.sort(temp);

 // Memeriksai apakah daftar memuat 1, 2, 3, ..., 9
 for (int i = 0; i < 9; i++)
 if (temp[i] != i + 1)
 return false;

 return true; // Daftar memuat 1 sampai 9
 }
 }