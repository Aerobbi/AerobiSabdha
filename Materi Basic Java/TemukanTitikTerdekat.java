import java.util.Scanner;

 public class TemukanTitikTerdekat {
 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan jumlah titik: ");
 int jumlahTitik = masukan.nextInt();

 // Menciptakan suatu array untuk menyimpan titik-titik
 double[][] titik2 = new double[jumlahTitik][2];
 System.out.print("Masukkan " + jumlahTitik + " titik: ");
 for (int i = 0; i < titik2.length; i++) {
 titik2[i][0] = masukan.nextDouble();
 titik2[i][1] = masukan.nextDouble();
 }

 // p1 dan p2 adalah indeks array titik2
 int p1 = 0, p2 = 1; // Inisialisasi dua titik
 double jarakTerdekat = jarak(titik2[p1][0], titik2[p1][1],
  titik2[p2][0], titik2[p2][1]);// Inisialisasi jarakTerdekat

 // Menghitung jarak untuk setiap dua titik
 for (int i = 0; i < titik2.length; i++) {
 for (int j = i + 1; j < titik2.length; j++) {
 double jarak = jarak(titik2[i][0], titik2[i][1],
 titik2[j][0], titik2[j][1]); // Mencari jarak

 if (jarakTerdekat > jarak) {
 p1 = i; // Memperbarui p1
 p2 = j; // Memperbarui p2
 jarakTerdekat = jarak; // Memperbarui jarakTerdekat
 }
 }
 }

 // Menampilkan hasil
 System.out.println("Dua titik terdekat adalah " +
 "(" + titik2[p1][0] + ", " + titik2[p1][1] + ") dan (" +
 titik2[p2][0] + ", " + titik2[p2][1] + ")");
 }

 /** Menghitung jarak antara dua titik (x1, y1) dan (x2, y2)*/
 public static double jarak(
 double x1, double y1, double x2, double y2) {
 return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
 }
 }