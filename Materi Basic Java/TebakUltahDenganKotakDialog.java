import javax.swing.JOptionPane;

 public class TebakUltahDenganKotakDialog {
 public static void main(String[] args) {
 String set1 =
 " 1 3 5 7\n" +
 " 9 11 13 15\n" +
 "17 19 21 23\n" +
 "25 27 29 31";

 String set2 =
 " 2 3 6 7\n" +
 "10 11 14 15\n" +
 "18 19 22 23\n" +
 "26 27 30 31";

 String set3 =
 " 4 5 6 7\n" +
 "12 13 14 15\n" +
 "20 21 22 23\n" +
 "28 29 30 31";

 String set4 =
 " 8 9 10 11\n" +
 "12 13 14 15\n" +
 "24 25 26 27\n" +
 "28 29 30 31";

 String set5 =
 "16 17 18 19\n" +
 "20 21 22 23\n" +
 "24 25 26 27\n" +
 "28 29 30 31";
 
 int hari = 0;
 
  // Meminta pengguna memberikan jawaban
int jawab = JOptionPane.showConfirmDialog(null,
"Apakah Ultah Anda pada angka-angka berikut?\n" + set1);
 
 if (jawab == JOptionPane.YES_OPTION)
 	hari += 1;
 
 jawab = JOptionPane.showConfirmDialog(null,
 "Apakah Ultah Anda pada angka-angka berikut?\n" + set2);

 if (jawab == JOptionPane.YES_OPTION)
 hari += 2;

 jawab = JOptionPane.showConfirmDialog(null,
 "Apakah Ultah Anda pada angka-angka berikut?\n" + set3);

 if (jawab == JOptionPane.YES_OPTION)
 hari += 4;

 jawab = JOptionPane.showConfirmDialog(null,
 "Apakah Ultah Anda pada angka-angka berikut?\n" + set4);

 if (jawab == JOptionPane.YES_OPTION)
 hari += 8;

 jawab = JOptionPane.showConfirmDialog(null,
 "Apakah Ultah Anda pada angka-angka berikut?\n" + set5);

 if (jawab == JOptionPane.YES_OPTION)
 hari += 16;

 JOptionPane.showMessageDialog(null, "Ultah Anda adalah " +
 hari + "!");
 }
 }