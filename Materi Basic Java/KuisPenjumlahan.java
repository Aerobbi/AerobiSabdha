import java.util.Scanner;

 public class KuisPenjumlahan {
 public static void main(String[] args) {
int angka1 = (int)(System.currentTimeMillis() % 10);
int angka2 = (int)(System.currentTimeMillis() * 7 % 10);

 // Ciptakan suatu Scanner
 Scanner masukan = new Scanner(System.in);

 System.out.print(
 "Berapakah " + angka1 + " + " + angka2 + "? ");

int jawaban = masukan.nextInt();

 System.out.println(
 angka1 + " + " + angka2 + " = " + jawaban + " adalah " +
 ( angka1 + angka2 == jawaban));
  }
 }