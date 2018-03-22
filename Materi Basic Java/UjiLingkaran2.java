public class UjiLingkaran2 {
 /** Metode Utama */
 public static void main(String[] args) {
 System.out.println("Sebelum menciptakan objek-objek");
 System.out.println("Jumlah objek Lingkaran adalah " +
 Lingkaran2.jumlahObjek);

 // Menciptakan c1
  Lingkaran2 c1 = new Lingkaran2();

 // Menampilkan c1 dan SEBELUM c2 diciptakan
 System.out.println("\nSetelah menciptakan c1");
 System.out.println("c1: radius (" + c1.radius +
 ") dan jumlah objek Lingkaran (" +
c1.jumlahObjek + ")");

 // Menciptakan c2
 Lingkaran2 c2 = new Lingkaran2(5);

 // Memodifikasi c1
 c1.radius = 9;

 // Menampilkan c1 dan c2 SETELAH c2 diciptakan
 System.out.println("\nSetelah menciptakan c2 dan memodifikasi c1");
 System.out.println("c1: radius (" + c1.radius +
 ") dan jumlah objek Lingkaran (" +
 c1.jumlahObjek+ ")");
 System.out.println("c2: radius (" + c2.radius +
 ") dan jumlah objek Lingkaran (" +
 c2.jumlahObjek + ")");
 }
 }