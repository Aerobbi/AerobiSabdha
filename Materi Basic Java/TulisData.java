 public class TulisData {
 public static void main(String[] args) throws Exception {
 java.io.File file = new java.io.File("skor.txt");
 if (file.exists()) {
 System.out.println("File sudah ada");
 System.exit(0);
 }

 // Menciptakan suatu file
 java.io.PrintWriter keluaran = new java.io.PrintWriter(file);
 // Menulis keluaran terformat ke dalam file
 output.print("Rismon H Sianipar ");
 output.println(90);
 output.print("Rebecca V Siahaan ");
 output.println(85);
 // Menutup file
 keluaran.close();
 }
 }