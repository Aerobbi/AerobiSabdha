public class Lingkaran1 {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan suatu objek lingkaran1 dengan radius 1.0
 Lingkaran1 lingkaran1 = new Lingkaran1();
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran1.radius + " adalah " + lingkaran1.dapatLuas());

// Menciptakan suatu objek lingkaran2 dengan radius 25
Lingkaran1 lingkaran2 = new Lingkaran1(25);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran2.radius + " adalah " + lingkaran2.dapatLuas() );
 
 
// Menciptakan suatu objek lingkaran2 dengan radius 25
Lingkaran1 lingkaran3 = new Lingkaran1(125);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran3.radius + " adalah " + lingkaran3.dapatLuas());
 
 
 // Memodifikasi radius lingkaran
 lingkaran2.radius = 100;
System.out.println("Luas lingkaran dengan radius "
 + lingkaran2.radius + " adalah " + lingkaran2.dapatLuas());
 }

 

double radius;

 /** Mengkonstruksi suatu objek Lingkaran1 dengan radius 1 */
 Lingkaran1(){
 radius = 1.0;
 }

 /** Mengkonstruksi suatu objek Lingkaran1 dengan radius tertentu */
 Lingkaran1(double radiusBaru){
 radius = radiusBaru;
 }

 /** Mengembalikan luas lingkaran */
 double dapatLuas(){
 return radius * radius * Math.PI;
 }
 }
 