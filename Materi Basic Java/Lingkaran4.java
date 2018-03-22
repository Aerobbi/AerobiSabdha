 public class Lingkaran4 extends ObjekGeometri1{
 private double radius;

 public Lingkaran4() {
 }

 public Lingkaran4 (double radius) {
 this.radius = radius;
 }

 public Lingkaran4(double radius, String warna, boolean terisi) {
 this.radius = radius;
 dapatWarna(warna);
 tetapkanTerisi(terisi);
 }

 /** Mengembalikan radius */
 public double dapatRadius() {
 return radius;
 }

 /** Menetapkan suatu radius baru */
 public void tetapkanRadius(double radius) {
 this.radius = radius;
 }

 /** Mengembalikan luas */
 public double dapatLuas() {
 return radius * radius * Math.PI;
 }

 /** Mengembalikan diameter */
 public double dapatDiameter() {
 return 2 * radius;
 }

 /** Mengembalikan keliling */
 public double dapatKeliling() {
 return 2 * radius * Math.PI;
 }

 /* Menampilkan informasi lingkaran */
 public void tampilLingkaran() {
 System.out.println("Lingkaran diciptakan pada "+ dapatTanggalDiciptakan() +
 " dan radiusnya adalah " + radius);
 }
 }