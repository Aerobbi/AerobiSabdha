import java.util.Scanner;

public class HitungHutang {
public static void main(String[] args) {
// Ciptakan Scanner
Scanner masukan = new Scanner(System.in);

// Masukkan suku bunga tahunan
System.out.print("Masukkan laju suku bunga tahunan, misalnya 11.25: ");
double sukuBungaTahunan = masukan.nextDouble();

// Dapatkan suku bunga bulanan
double sukuBungaBulanan = sukuBungaTahunan / 12;

// Masukkan jumlah tahun
System.out.print("Masukkan jumlah tahun (sebagai integer), misalnya 5: ");
int jumlahTahun = masukan.nextInt();

// Masukkan jumlah pinjaman
System.out.print("Masukkan jumlah pinjaman, misalnya 1234.95: ");
double jumlahPinjaman = masukan.nextDouble();

// Hitung pembayaran
double pembayaranBulanan= jumlahPinjaman * sukuBungaBulanan / (1 - 1 / Math.pow(1 + sukuBungaBulanan, jumlahTahun * 12));
double pembayaranTotal= pembayaranBulanan * jumlahTahun * 12;

// Tampilkan hasil
System.out.println("Pembayaran bulanan adalah " +
(int)(pembayaranBulanan * 100) / 100.0);
System.out.println("Total pembayaran adalah " +
(int)(pembayaranTotal * 100) / 100.0);
}
}