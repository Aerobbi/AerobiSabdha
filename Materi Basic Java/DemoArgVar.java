 public class DemoArgVar {
 public static void main(String[] args) {
 printMax(34, 3, 3, 2, 56.5);
 printMax(new double[]{1, 2, 3});
 }

 public static void printMax(double... angka ) {
 if (angka.length == 0) {
 System.out.println("Tidak ada argumen yang dilewatkan");
 return;
 }

 double hasil = angka[0];

 for (int i = 1; i < angka.length; i++)
 if (angka[i] > hasil)
 hasil = angka[i];

 System.out.println("Nilai maksimum adalah " + hasil);
 }
 }