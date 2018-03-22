public class Uji {
 public static void main(String[] args) {
 // Lingkaran3 didefinisikan dalam kode8.9
 Lingkaran3 lingkaranKu = new Lingkaran3(5.0);
 tampilLingkaran(lingkaranKu);
 }

 public static void tampilLingkaran(Lingkaran3 c){
 System.out.println("Luas lingkaran dengan radius "
 + c.dapatRadius() + " adalah " + c.dapatLuas());
 }
 }