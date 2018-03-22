import java.util.Scanner;

public class HasilBagiDenganIf {
  public static void main(String[] args) {
  Scanner masukan = new Scanner(System.in);

  // Meminta pengguna untuk memasukkan dua integer
  System.out.print("Masukkan dua integer: ");
  int angka1 = masukan.nextInt();
  int angka2 = masukan.nextInt();

  if (angka2 != 0)
  System.out.println(angka1 + " / " + angka2 + " adalah " +
   (angka1 / angka2));
   else
 System.out.println("Pembagi tidak boleh nol ");
  }
}
