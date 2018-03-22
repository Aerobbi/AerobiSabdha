 public class UjiLingkaranDenganEksepsi {
 public static void main(String[] args) {
  try {
 LingkaranDenganEksepsi c1 = new LingkaranDenganEksepsi(5);
 LingkaranDenganEksepsi c2 = new LingkaranDenganEksepsi(-5);
 LingkaranDenganEksepsi c3 = new LingkaranDenganEksepsi(0);
 }
 catch (IllegalArgumentException ex) {
 System.out.println(ex);
 }

 System.out.println("Jumlah objek yang diciptakan: " +
 LingkaranDenganEksepsi.dapatJumlahObjek());
 }
 }