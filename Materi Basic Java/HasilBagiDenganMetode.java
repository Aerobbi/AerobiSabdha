 import java.util.Scanner;

 public class HasilBagiDenganMetode {
 public static int hasilBagi(int angka1, int angka2) {
 if (angka2 == 0)
 throw new ArithmeticException("Pembagi tidak boleh nol");

 return angka1 / angka2;
 }

 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan dua integer
 System.out.print("Masukkan dua integer: ");
 int angka1 = masukan.nextInt();
 int angka2 = masukan.nextInt();

 try {
 int hasil = hasilBagi(angka1, angka2);
 System.out.println(angka1 + " / " + angka2 + " adalah "
 + hasil);
 }
 catch (ArithmeticException ex) {
 System.out.println("Eksepsi: suatu integer " +
 "tidak dapat dibagi oleh nol ");
 }

 System.out.println("Eksekusi berlanjut ...");
 }
 }