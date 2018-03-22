import java.util.Scanner; // Scanner berada dalam paket java.util

public class HitungRerata {
public static void main(String[] args) {
	 // Ciptakan suatu objek Scanner
Scanner input = new Scanner(System.in);

// Meminta pengguna memasukkan tiga angka
System.out.print("Masukkan tiga angka: ");
double angka1 = input.nextDouble();
double angka2 = input.nextDouble();
double angka3 = input.nextDouble();

 // Hitung rerata
 double rerata = (angka1 + angka2 + angka3) / 3;

// Tampilkan hasil
System.out.println("Rerata dari " + angka1 + " " + angka2
+ " " + angka3 + " adalah " + rerata);
 }
 }