import java.util.Scanner; // Scanner dalam paket java.util

public class HitungLuasDenganKonsol {
public static void main(String[] args) {
// Menciptakan suatu objek Scanner
Scanner masukan = new Scanner(System.in);

// Meminta pengguna untuk mengentri radius
System.out.print("Masukkan suatu angka untuk radius: ");
double radius = masukan.nextDouble();

// Hitung luas
double luas = radius * radius * 3.14159;

// Tampilkan hasil
System.out.println("Luas lingkaran dengan radius " +
radius + " adalah " + luas);
}
}