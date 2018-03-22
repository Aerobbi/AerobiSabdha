 public class ObjekGeometri1 {
 private String warna = "putih";
 private boolean terisi;
 private java.util.Date tanggalDiciptakan;

 /** Menciptakan suatu objek geometri default */
 public ObjekGeometri1() {
 tanggalDiciptakan = new java.util.Date();
 }

 /** Menciptakan suatu objek geometri dengan warna dan
   * nilai terisi tertentu */
 public ObjekGeometri1(String warna, boolean terisi) {
 tanggalDiciptakan = new java.util.Date();
 this.warna = warna;
 this.terisi = terisi;
 }

 /** Mengembalikan warna */
 public String dapatWarna() {
 return warna;
 }

 /** Menetapkan suatu warna baru */
 public void dapatWarna(String warna) {
 this.warna = warna;
 }

 /** Mengembalikan terisi. Karena terisi adalah suatu boolean,
 metode dapat dinamai apaTerisi */
 public boolean apaTerisi() {
 return terisi;
 }

 /** Menetapkan suatu nilai terisi yang baru */
 public void tetapkanTerisi(boolean terisi) {
 this.terisi = terisi;
 }

 /** Mendapatkan tanggalDiciptakan */
 public java.util.Date dapatTanggalDiciptakan() {
 return tanggalDiciptakan;
 }

 /** Mengembalikan suatu representasi string atas objek ini */
 public String keString() {
 return "diciptakan pada " + tanggalDiciptakan + "\nwarna: " + warna +
 " dan nilai terisi: " + terisi;
 }
 }