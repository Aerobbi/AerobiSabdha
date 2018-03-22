public class Lingkaran2 {
 /** Radius lingkaran */
 double radius;

 /** Jumlah objek yang diciptakan */
 static int jumlahObjek = 0;

 /** Mencipatakan suatu objek Lingkaran dengan radius 1 */
 Lingkaran2() {
 radius = 1.0;
 jumlahObjek++;
 }

  /** Mencipatakan suatu objek Lingkaran dengan radius ditentukan */
 Lingkaran2(double radiusBaru) {
 radius = radiusBaru;
 jumlahObjek++;
 }

 /** Memberikan nilai balik jumlahObjek */
 static int dapatJumlahObjek() {
 return jumlahObjek;
 }

 /** Memberikan nilai balik luas lingkaran */
 double dapatLuas() {
 return radius * radius * Math.PI;
 }
 }