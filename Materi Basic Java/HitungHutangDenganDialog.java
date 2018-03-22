import javax.swing.JOptionPane;

public class HitungHutangDenganDialog {
public static void main(String[] args) {
// Masukkan suku bunga tahunan
String sukuBungaTahunanString = JOptionPane.showInputDialog(
"Masukkan suku bunga tahunan, misal 8.25:");

// Konversi ke double
double sukuBungaTahunan =
Double.parseDouble(sukuBungaTahunanString);

// Dapatkan suku bunga bulanan
double sukuBungaBulanan = sukuBungaTahunan / 1200;

//Masukkan jumlah tahun
String jumlahTahunString = JOptionPane.showInputDialog(
"Masukkan jumlah tahun sebagai integer, \nmisalnya 5:");

// Konversi string ke int
int jumlahTahun = Integer.parseInt(jumlahTahunString);

//Masukkan jumlah pinjaman
String pinjamanString = JOptionPane.showInputDialog(
"Masukkan jumlah pinjaman, misalnya 120000.95:");

// Konversi string ke double
double jumlahPinjaman = Double.parseDouble(pinjamanString);

// Hitung pembayaran
double pembayaranBulanan=jumlahPinjaman/(jumlahTahun*12)+jumlahPinjaman*sukuBungaBulanan;
//double pembayaranBulanan= jumlahPinjaman * sukuBungaBulanan / (1 - 1 / Math.pow(1 + sukuBungaBulanan, jumlahTahun * 12));
double pembayaranTotal= pembayaranBulanan * jumlahTahun * 12;

//Untuk menetapkan dua dijit di belakang titik desimal
pembayaranBulanan = (int)(pembayaranBulanan * 100) / 100.0;
pembayaranTotal = (int)(pembayaranTotal * 100) / 100.0;

// Tampilkan hasil
String keluaran ="Pembayaran bulanan adalah " + pembayaranBulanan +
"\nTotal pembayaran adalah " + pembayaranTotal;
JOptionPane.showMessageDialog(null,keluaran);
}
}