 public class PersegiPanjang1 extends ObjekGeometri1 {
 private double lebar;
 private double tinggi;

 public PersegiPanjang1() {
 }

 public PersegiPanjang1(double lebar, double tinggi) {
 this.lebar = lebar;
 this.tinggi = tinggi;
 }

 public PersegiPanjang1(double lebar, double tinggi, String warna,
 boolean terisi) {
 this.lebar = lebar;
 this.tinggi = tinggi;
 dapatWarna(warna);
 tetapkanTerisi(terisi);
 }

 /** Mengembalikan lebar */
 public double dapatLebar() {
 return lebar;
 }

 /** Menetapkan suatu lebar baru */
 public void dapatLebar(double lebar) {
 this.lebar = lebar;
 }

 /** Mengembalikan tinggi */
 public double dapatTinggi() {
 return tinggi;
 }

 /** Menetapkan suatu tinggi baru */
 public void tetapkanTinggi(double tinggi) {
 this.tinggi = tinggi;
 }

 /** Mengembalikan luas */
 public double dapatLuas() {
 return lebar * tinggi;
 }

 /** Mengembalikan keliling persegi-panjang */
 public double dapatKeliling() {
 return 2 * (lebar + tinggi);
 }
 }