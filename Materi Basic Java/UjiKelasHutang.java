 import java.util.Scanner;

 public class UjiKelasHutang {
 /** Metode utama */
 public static void main(String[] args) {
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Memasukkan suku bunga tahunan
 System.out.print(
 "Masukkan suku bunga tahunan, misalnya, 8.25: ");
 double sukuBungaTahunan = masukan.nextDouble();

 // Masukkan jumlah tahun
 System.out.print("Masukkan jumlah tahun sebagai suatu integer: ");
 int jumlahTahun = masukan.nextInt();

 // Masukkan jumlah pinjaman
 System.out.print("Masukkan jumlah pinjaman, misalnya, 120000.95: ");
 double jumlahPinjaman = masukan.nextDouble();

 // Menciptakan suatu objek Hutang
 Hutang hutang =
 new Hutang(sukuBungaTahunan, jumlahTahun, jumlahPinjaman);

 // Menampilkan tanggal pinjaman, pembayaran bulanan, dan pembayaran total
 System.out.printf("Hutang dibuat pada %s\n" +
 "Pembayaran bulanan sebesar %.2f\nPembayaran total sebesar %.2f\n",
 hutang.dapatTanggalPinjaman().toString(), hutang.dapatPembayaranBulanan(),
 hutang.dapatPembayaranTotal());
 }
 }