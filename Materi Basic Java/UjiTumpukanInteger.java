 public class UjiTumpukanInteger {
 public static void main(String[] args) {
 TumpukanInteger tumpukan = new TumpukanInteger();

 for (int i = 0; i < 10; i++)
 tumpukan.dorong(i);

 while (!tumpukan.kosong())
 System.out.print( tumpukan.hapus() + " ");
 }
 }