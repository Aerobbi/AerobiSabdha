public class TabelPerkalian {
 /** Metode utama */
 public static void main(String[] args) {
 // Menampilkan kepala tabel
 System.out.println("          Tabel Perkalian");

 // Menampilkan judul angka
 System.out.print("    ");
 for (int j = 1; j <= 9; j++)
 System.out.print("   " + j);

 System.out.println("\n———————————————————————————————————————");
 
 // Mencetak tubuh tabel
 for (int i = 1; i <= 9; i++) {
 	System.out.print(i + " | ");
 	for (int j = 1; j <= 9; j++) {
 		// Menampilkan perkalian dan ratakan secara layak
 System.out.printf("%4d", i * j);
 }
 System.out.println();
 }
 }
 }