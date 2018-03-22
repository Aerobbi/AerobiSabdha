public class TotalLuas {
/** Metode utama */
 public static void main(String[] args) {
 // Mendeklarasikan lingkaranArray
 Lingkaran3[] arrayLingkaran;

 // Menciptakan arrayLingkaran
 arrayLingkaran = ciptaArrayLingkaran();

 // Menampilkan arrayLingkaran dan total luas lingkaran
 tampilArrayLingkaran(arrayLingkaran);
 }

 /** Menciptakan suatu array yang memuat objek-objek Lingkaran3 */
 public static Lingkaran3[] ciptaArrayLingkaran(){
 Lingkaran3[] arrayLingkaran = new Lingkaran3[5];

 for (int i = 0; i < arrayLingkaran.length; i++) {
 arrayLingkaran[i] = new Lingkaran3(Math.random() * 100);
 }

 // Mengembalikan array yang memuat objek-objek Lingkaran3
 return arrayLingkaran;
 }

 /** Menampilkan suatu array Lingkaran3 dan total luas */
 public static void tampilArrayLingkaran(Lingkaran3[] arrayLingkaran){
 System.out.printf("%-30s%-15s\n", "Radius", "Luas");
 for (int i = 0; i < arrayLingkaran.length; i++) {
 System.out.printf("%-30f%-15f\n", arrayLingkaran[i].dapatRadius(),
 arrayLingkaran[i].dapatLuas());
 }

 System.out.println("—————————————————————————————————————————");

 // Menghitung dan menampilkan luas
 System.out.printf("%-30s%-15f\n", "Total luas lingkaran adalah ",
 jumlah(arrayLingkaran));
 }

 /** Menjumlahkan luas lingkaran */
 public static double jumlah(Lingkaran3[] arrayLingkaran){
 // menginisialisasi jum
 double jum = 0;

 // Menambah luas kepada jum
 for (int i = 0; i < arrayLingkaran.length; i++)
 jum += arrayLingkaran[i].dapatLuas();

 return jum;
 }
  }