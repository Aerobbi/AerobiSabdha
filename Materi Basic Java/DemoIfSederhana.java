import java.util.Scanner;

 public class DemoIfSederhana {
 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);
 System.out.println("Masukkan suatu integer: ");
 int angka = masukan.nextInt();

if (angka % 5 == 0)
 System.out.println("KelipatanLima");

if (angka % 2 == 0)
 System.out.println("AngkaGenap");
 }
 }