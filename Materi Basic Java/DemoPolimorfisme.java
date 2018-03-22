 public class DemoPolimorfisme {
 /** Metode utama */
 public static void main(String[] args) {
 // Menampilkan watak lingkaran dan persegi-panjang
 tampilObjek(new Lingkaran4(1, "merah", false));
 tampilObjek(new PersegiPanjang1(1, 1, "hitam", true));
 }

 /** Menampilkan watak objek geometri */
 public static void tampilObjek(ObjekGeometri1 objek){
 System.out.println("Diciptakan pada " + objek.dapatTanggalDiciptakan() +
 ". Warna adalah " + objek.dapatWarna());
 }
 }