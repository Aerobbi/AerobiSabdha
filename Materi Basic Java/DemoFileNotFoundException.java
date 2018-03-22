 import java.util.Scanner;
 import java.io.*;

 public class DemoFileNotFoundException {
 public static void main(String[] args) {
 Scanner masukanDariKonsol = new Scanner(System.in);
 // Meminta pengguna memasukkan suatu nama file
 System.out.print("Masukkan suatu nama file: ");
 String namafile = masukanDariKonsol.nextLine();

 try {
 Scanner masukanDariFile = new Scanner(new File(namafile));
 System.out.println("File " + namafile + " ada ");
 // Memproses file...
 }
 catch (FileNotFoundException ex) {
 System.out.println("Eksepsi: " + namafile + " tidak ada");
 }
 }
 }