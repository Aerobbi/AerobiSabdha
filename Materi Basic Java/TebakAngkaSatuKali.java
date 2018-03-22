import java.util.Scanner;

 public class TebakAngkaSatuKali {
 public static void main(String[] args) {
 // Membangkitkan suatu angka acak untuk ditebak
 int angka = (int)(Math.random() * 101);

Scanner masukan = new Scanner(System.in);
 System.out.println("Tebak suatu angka dari 0 sampai 100");

 // Meminta pengguna memasukkan tebakan
 System.out.print("\nBerikan tebakan Anda: ");
 int tebak = masukan.nextInt();
 
 if (tebak == angka)
 	System.out.println("Ya, Anda benar, Angka Magic adalah " + angka);
 else if (tebak > angka)
 	System.out.println("Tebakan Anda terlalu tinggi");
else
System.out.println("Tebakan Anda terlalu rendah");
 }
 }