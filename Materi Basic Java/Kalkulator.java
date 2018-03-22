public class Kalkulator {
/** Metode utama */
 public static void main(String[] args) {
	 // Memeriksa jumlah string yang dilewatkan
 if (args.length != 3) {
 System.out.println(
 "Usage: java Kalkulator operand1 operator operand2");
 System.exit(0);
 }

 // Hasil operasi
 int hasil = 0;

 // Menentukan operator
 switch(args[1].charAt(0)) {
 case '+': hasil = Integer.parseInt(args[0]) +
 Integer.parseInt(args[2]);
 break;
 case '-': hasil = Integer.parseInt(args[0]) -
 Integer.parseInt(args[2]);
 break;
 case '*': hasil = Integer.parseInt(args[0]) *
 Integer.parseInt(args[2]);
 break;
 case '/': hasil = Integer.parseInt(args[0]) /
 Integer.parseInt(args[2]);
 }

 // Menampilkan hasil
 System.out.println( args[0]+ ' '+ args[1]+ ' ' + args[2]
 + " = " + hasil);
 }
  }