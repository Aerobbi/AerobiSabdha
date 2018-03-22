public class UjiKarakterAcak {
 /** Metode utama */
 public static void main(String[] args) {
 final int JUMLAH_KARAKTER = 300;
 final int KARAKTER_PER_BARIS = 25;

 // MEnampilkan karakter-karakter acak dari 'a' sampai 'z', 25 karakter per baris
 for (int i = 0; i < JUMLAH_KARAKTER; i++) {
 char ch = KarakterAcak.dapatHurufBesarAcak();
 if ((i + 1) % KARAKTER_PER_BARIS == 0)
 System.out.println(ch);
 else
 System.out.print(ch);
 }
 }
 }