import java.util.Scanner;

public class TampilWaktu {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);

// Meminta pengguna untuk memberikan masukan
System.out.print("Masukkan suatu integer untuk detik: ");
int detik = masukan.nextInt();

int menit = detik / 60; // Mencari menit
int sisaDetik = detik % 60; // Sisa detik
System.out.println(detik + " detik adalah " + menit +
 " menit dan " + sisaDetik + " detik");
}
}