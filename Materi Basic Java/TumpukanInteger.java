 public class TumpukanInteger {
 private int[] elemen;
 private int ukuran;
 public static final int KAPASITAS_DEFAULT = 16;

 /** Menciptakan suatu tumpukan dengan kapasitas default 16 */
 public TumpukanInteger(){
 this(KAPASITAS_DEFAULT);
 }

 /**  Menciptakan suatu tumpukan dengan kapasitas tertentu */
 public TumpukanInteger(int kapasitas){
 elemen = new int[kapasitas];
 }

 /** Mendorong suatu integer baru ke dalam tumpukan */
 public void dorong(int nilai) {
 if (ukuran >= elemen.length) {
 int[] temp = new int[elemen.length * 2];
 System.arraycopy(elemen, 0, temp, 0, elemen.length);
 elemen = temp;
 }

 elemen[ukuran++] = nilai;
 }

 /** Mengembalikan dan menghapus elemen teratas dari tumpukan */
 public int hapus() {
 return elemen[--ukuran];
 }

 /** Mengembalikan elemen teratas dari tumpukan */
 public int intip() {
 return elemen[ukuran - 1];
 }

 /** Menguji apakah tumpukan kosong */
 public boolean kosong() {
 return ukuran == 0;
 }

 /** Mengembalikan jumlah elemen di dalam tumpukan */
 public int dapatUkuran() {
 return ukuran;
 }
 }