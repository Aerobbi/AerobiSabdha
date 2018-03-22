public class TestBreak {
 public static void main(String[] args) {
 int jumlah = 0;
 int angka = 0;

 while (angka < 20) {
 angka++;
 jumlah += angka;
 if (jumlah >= 100)
break;
 }

 System.out.println("Angka adalah " + angka);
 System.out.println("Jumlah adalah " + jumlah);
 }
 }