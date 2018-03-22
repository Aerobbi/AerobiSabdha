import java.util.Scanner;

 public class Lottery {
 public static void main(String[] args) {
 // Membangkitkan suatu lottery
 int lottery = (int)(Math.random() * 100);
 
 // Meminta pengguna memasukkan tebakan
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan tebakan Anda (dua dijit): ");
int tebak = masukan.nextInt();

// Mendapatkan dua-dijit untuk lottery
 int lotteryDijit1 = lottery / 10;
 int lotteryDijit2 = lottery % 10;

 // Mendapatkan dijit dari tebakan
 int tebakDijit1 = tebak / 10;
 int tebakDijit2 = tebak % 10;

 System.out.println("Angka lottery adalah " + lottery);
 
 // Periksa tebakan
 if (tebak == lottery)
 	System.out.println("Cocok dan Tepat: Anda memenangkan Rp. 10.000");
 	else if (tebakDijit1 == lotteryDijit1
 		&& tebakDijit1 == lotteryDijit2)
 			System.out.println("Cocok dengan semua dijit: Anda memenangkan Rp. 3.000");
 			else if (tebakDijit1 == lotteryDijit1
 				|| tebakDijit1 == lotteryDijit2
 					|| tebakDijit2 == lotteryDijit1
 						|| tebakDijit2 == lotteryDijit2)
System.out.println("Cocok satu dijit: Anda memenangkan Rp. 1.000");
 else
 System.out.println("Maaf, tidak cocok sama sekali");
 }
 }
 			
 	
 	