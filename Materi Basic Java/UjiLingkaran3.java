 public class UjiLingkaran3 {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan suatu lingkaran dengan radius 5.0
 Lingkaran3 lingkaranKu = new Lingkaran3(5.0);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaranKu.dapatRadius() + " adalah " + lingkaranKu.dapatLuas());

 // Menambah radius lingkaranKu sebesar 10%
 lingkaranKu.tetapkanRadius(lingkaranKu.dapatRadius() * 1.1);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaranKu.dapatRadius() + " adalah " + lingkaranKu.dapatLuas());

 System.out.println("Jumlah objek yang diciptakan adalah "
 + Lingkaran3.dapatJumlahObjek());
 }
 }