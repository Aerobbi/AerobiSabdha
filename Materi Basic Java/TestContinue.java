public class TestContinue {
 public static void main(String[] args) {
 int jumlah = 0;
 int angka = 0;

 while (angka < 20) {
 angka++;
 if (angka == 10 || angka == 11)
 continue;
 jumlah += angka;
 }

 System.out.println("Jumlah adalah " + jumlah);
 }
 }