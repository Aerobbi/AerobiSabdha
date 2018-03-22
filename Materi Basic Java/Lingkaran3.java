public class Lingkaran3 {
 /** Radius lingkaran */
 private double radius = 1;
 
 /** Jumlah objek yang diciptakan */
 private static int jumlahObjek = 0;

 /** Menciptakan suatu lingkaran dengan radius 1 */
 public Lingkaran3() {
 jumlahObjek++;
 }

 /** Menciptakan suatu lingkaran dengan radius tertentu */
 public Lingkaran3(double radiusBaru) {
 radius = radiusBaru;
 jumlahObjek++;
 }

 /** Memberikan nilai balik radius */
 public double dapatRadius(){
 return radius;
 }

 /** Menetapkan nilai radius baru */
 public void tetapkanRadius(double radiusBaru){
 radius = (radiusBaru >= 0) ? radiusBaru : 0;
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