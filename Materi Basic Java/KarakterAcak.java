public class KarakterAcak {
 /** Membangkitkan suatu karakter acak antara ch1 sampai ch2 */
 public static char dapatKarakterAcak(char ch1, char ch2){
 return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
 }

/** Membangkitkan suatu huruf kecil acak */
 public static char dapatHurufKecilAcak(){
 return dapatKarakterAcak('a', 'z');
 }

/** Membangkitkan suatu huruf besar acak */
 public static char dapatHurufBesarAcak(){
 return dapatKarakterAcak('A', 'Z');
 }

 /** Membangkitkan suatu karakter dijit acak */
 public static char dapatKarakterDijitAcak(){
 return dapatKarakterAcak('0', '9');
 }

 /** Membangkitkan suatu karakter acak */
 public static char dapatKarakterAcak(){
 return dapatKarakterAcak('\u0000', '\uFFFF');
 }
 }