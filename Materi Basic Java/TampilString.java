import java.util.Scanner;

public class TampilString {
   public static void main(String[] args) {
     Scanner masukan = new Scanner(System.in);
     System.out.println("Masukkan tiga string: ");
     String s1 = masukan.next();
     String s2 = masukan.next();
     String s3 = masukan.next();
     System.out.println("s1 adalah " + s1);
     System.out.println("s2 adalah " + s2);
     System.out.println("s3 adalah " + s3);
   }
}      
