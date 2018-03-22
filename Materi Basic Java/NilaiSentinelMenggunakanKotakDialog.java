import javax.swing.JOptionPane;

 public class NilaiSentinelMenggunakanKotakDialog {
 public static void main(String[] args) {
 int jumlah = 0;

 // Tetap membaca data sampai pengguna menjawab No
 int opsi = JOptionPane.YES_OPTION;
 while (opsi == JOptionPane.YES_OPTION) {
 // Membaca data berikutnya
 String dataString = JOptionPane.showInputDialog(
 "Masukkan suatu nilai int: ");
 int data = Integer.parseInt(dataString);

 jumlah += data;

 opsi = JOptionPane.showConfirmDialog(null, "Lanjut?");
 }

 JOptionPane.showMessageDialog(null, "Jumlah adalah " + jumlah);
 }
 }