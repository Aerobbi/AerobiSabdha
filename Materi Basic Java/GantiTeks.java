 import java.io.*;
 import java.util.*;

 public class GantiTeks {
 public static void main(String[] args) throws Exception {
 // Memeriksa parameter command-line
 if (args.length != 4) {
 System.out.println(
 "Usage: java GantiTeks fileSumber fileTarget stringLama stringBaru");
 System.exit(0);
 }

 // Memeriksa apakah file sumber sudah ada
  File fileSumber = new File(args[0]);
 if(!fileSumber.exists()) {
 System.out.println("File Sumber " + args[0] + " belum ada");
 System.exit(0);
 }

 // Memeriksa apakah file target sudah ada
 File fileTarget = new File(args[1]);
 if(fileTarget.exists()) {
 System.out.println("File target " + args[1] + " belum ada");
 System.exit(0);
 }

 // Menciptakan suatu Scanner untuk masukan dan PrintWriter untuk keluaran
 Scanner masukan = new Scanner(fileSumber);
 PrintWriter keluaran = new PrintWriter(fileTarget);

 while(masukan.hasNext()) {
 String s1 = masukan.nextLine();
 String s2 = s1.replaceAll(args[2], args[3]);
 keluaran.println(s2);
 }

 masukan.close();
 keluaran.close();
 }
 }