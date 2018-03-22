public class UjiPelewatanObjek {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan suatu objek Lingkaran3 dengan radius 1
 Lingkaran3 lingkaranKu = new Lingkaran3(1);

 // Menampilkan luas lingkaran untuk radius 1, 2, 3, 4, dan 5.
 int n = 5;
 tampilLuas(lingkaranKu, n);

 // Melihat lingkaranKu.radius dan kali
 System.out.println("\n" + "Radius = " + lingkaranKu.dapatRadius());
 System.out.println("n = " + n);
 }

 /** Menampilkan suatu tabel luas dengan radius */
 public static void tampilLuas(Lingkaran3 c, int kali){
 System.out.println("Radius \t\tLuas");
 while (kali >= 1) {
 System.out.println(c.dapatRadius() + "\t\t" + c.dapatLuas());
 c.tetapkanRadius(c.dapatRadius() + 1);
 kali--;
 }
 }
 }