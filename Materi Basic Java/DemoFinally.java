 public class DemoFinally {
 public static void main(String[] args) {
 java.io.PrintWriter keluaran = null;

 try {
 // Menciptakan suatu file
 keluaran = new java.io.PrintWriter("teks.txt");

 // Menulis keluaran terformat pada file
 keluaran.println("JAVA itu Tangguh!");
 }
 catch (java.io.IOException ex) {
 ex.printStackTrace();
 }
 finally {
 // Menutup
 if (keluaran != null) keluaran.close();
 }

 System.out.println("Akhir program");
 }
 }