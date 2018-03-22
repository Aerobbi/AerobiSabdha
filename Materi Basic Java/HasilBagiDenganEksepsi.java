import java.util.Scanner;

public class HasilBagiDenganEksepsi {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);

// Meminta pengguna memasukkan dua integer
System.out.print("Masukkan dua integer: ");
int angka1 = masukan.nextInt();
int angka2 = masukan.nextInt();

try {
if (angka2 == 0)
throw new ArithmeticException("Pembagi tidak boleh nol");

System.out.println(angka1 + " / " + angka2 + " adalah " +
(angka1 / angka2));
}
catch (ArithmeticException ex) {
System.out.println("Eksepsin: suatu integer " +
"tidak bisa dibagi oleh nol ");
}

System.out.println("Eksekusi berlanjut ...");
}
}