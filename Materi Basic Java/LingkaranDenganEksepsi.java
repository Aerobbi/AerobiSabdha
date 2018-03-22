public class LingkaranDenganEksepsi {
 /** Radius lingkaran */
 private double radius = 1;
 
 /** Jumlah objek yang diciptakan */
 private static int jumlahObjek = 0;

 /** Menciptakan suatu lingkaran dengan radius 1 */
 public LingkaranDenganEksepsi() {
 this(1.0);
 }

 /** Menciptakan suatu lingkaran dengan radius tertentu */
 public LingkaranDenganEksepsi(double radiusBaru) {
 tetapkanRadius(radiusBaru);
 jumlahObjek++;
 }

 /** Memberikan nilai balik radius */
 public double dapatRadius(){
 return radius;
 }

 /** Menetapkan nilai radius baru */
 public void tetapkanRadius(double radiusBaru)
 throws IllegalArgumentException {
 	if (radiusBaru >= 0)
 radius = radiusBaru;
 else
 	throw new IllegalArgumentException(
 		"Radius tidak boleh negatif");
 
 }

 /** Mengembalikan jumlahObjek */
 public static int dapatJumlahObjek(){
 return jumlahObjek;
 }

 /** Mengembalikan luas lingkaran */
 public double dapatLuas() {
 return radius * radius * Math.PI;
 }
  }