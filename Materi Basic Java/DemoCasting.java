 public class DemoCasting {
 /** Main method */
 public static void main(String[] args) {
 // Menciptakan dan menginisialisasi dua objek
 Object objek1 = new Lingkaran4(1);
 Object objek2 = new PersegiPanjang1(1, 1);

 // Menampilkan lingkaran dan persegi-panjang
 tampilObjek(objek1);
 tampilObjek(objek2);
 }

 /** Metode untuk menampilkan suatu objek */
 public static void tampilObjek(Object objek){
 if(objek instanceof Lingkaran4) {
 System.out.println("Luas lingkaran adalah " +
 ((Lingkaran4)objek).dapatLuas());
 System.out.println("Diameter lingkaran adalah " +
 ((Lingkaran4)objek).dapatDiameter());
 }
 else if(objek instanceof PersegiPanjang1) {
 System.out.println("Luas persegi-panjang adalah " +
 ((PersegiPanjang1)objek).dapatLuas());
 }
 }
 }