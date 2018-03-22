 import java.util.Scanner;
 import javax.swing.JFileChooser;

 public class BacaFileMenggunakanJFileChooser {
 public static void main(String[] args) throws Exception {
JFileChooser pemilihFile = new JFileChooser();
 if (pemilihFile.showOpenDialog(null)

 == JFileChooser.APPROVE_OPTION) {
 // Mendapatkan file yang dipilih
 java.io.File file = pemilihFile.getSelectedFile();

 // Menciptakan suatu Scanner untuk the file
 Scanner masukan = new Scanner(file);

 // Membaca teks dari file
 while (masukan.hasNext()) {
 System.out.println(masukan.nextLine());
 }

 // Menutup file
 masukan.close();
 }
 else {
 System.out.println("Tidak ada file yang dipilih");
 }
 }
 }