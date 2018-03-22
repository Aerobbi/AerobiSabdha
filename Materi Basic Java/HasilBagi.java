import java.util.Scanner;

public class HasilBagi {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);

// Meminta pengguna untuk memasukkan dua integer
System.out.print("Masukkan dua integer: ");
int angka1 = masukan.nextInt();
int angka2 = masukan.nextInt();

System.out.println(angka1 + " / " + angka2 + " adalah " +
(angka1 / angka2));
}
}