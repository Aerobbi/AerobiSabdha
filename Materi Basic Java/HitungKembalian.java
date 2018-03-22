import java.util.Scanner;

 public class HitungKembalian {
 public static void main(String[] args) {
// Ciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Terima jumlah dolar
System.out.print(
"Masukkan sejumlah nilai dalam double, misalnya 11.56: ");
double jumlah = masukan.nextDouble();

int sisaJumlah = (int)(jumlah * 100);

 // Cari jumlah satu dolar
 int jumlahSatuDolar = sisaJumlah / 100;
 sisaJumlah = sisaJumlah % 100;
 
 // Cari jumlah quarter dalam sisa jumlah
 int jumlahQuarter = sisaJumlah / 25;
 sisaJumlah = sisaJumlah % 25;
 
 // Cari jumlah dime dalam sisa jumlah
 int jumlahDime = sisaJumlah / 10;
 sisaJumlah = sisaJumlah % 10;
 
 // Cari jumlah nickel dalam sisa jumlah
 int jumlahNickel = sisaJumlah / 5;
 sisaJumlah = sisaJumlah % 5;
 
 // Cari jumlah penny dalam sisa jumlah
 int jumlahPenny = sisaJumlah;
 
 // Tampilkan hasil
 System.out.println("Nilai yang Anda masukkan " + jumlah + " terdiri-dari \n" +
 "\t" + jumlahSatuDolar + " dolar\n" +
 "\t" + jumlahQuarter + " quarter\n" +
 "\t" + jumlahDime + " dime\n" +
 "\t" + jumlahNickel + " nickel\n" +
 "\t" + jumlahPenny + " penny");
 }
 }
 
 