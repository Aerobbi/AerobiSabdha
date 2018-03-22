public class PilihKartu {
 public static void main(String[] args) {
 int[] kartu = new int[52];
 String[] suit = {"Spade", "Heart", "Diamond", "Club"};
 String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
 "10", "Jack", "Queen", "King"};

 // Menginisilasi kartu
 for (int i = 0; i < kartu.length; i++)
 kartu[i] = i;

 // Mengacak kartu
 for (int i = 0; i < kartu.length; i++) {
 // Membangkitkan suatu indeks secara acak
 int index = (int)(Math.random() * kartu.length);
 int temp = kartu[i];
 kartu[i] = kartu[index];
 kartu[index] = temp;
 }

 // Menampilkan empat kartu pertama
 for (int i = 0; i < 4; i++) {
 String jenis_kartu = suit[kartu[i] / 13];
 String urutan_kartu = rank[kartu[i] % 13];
 System.out.println("Nomor kartu " + kartu[i] + ": "
 + urutan_kartu + "  " + jenis_kartu);
 }
 }
 }