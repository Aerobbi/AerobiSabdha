import java.util.Scanner;

 public class KuisPengurangan {
 public static void main(String[] args) {
 // 1. Bangkitkan dua integer satu-dijit, angka1 dan angka2
 int angka1 = (int)(Math.random() * 10);
 int angka2 = (int)(Math.random() * 10);

 // 2. Jika angka1 < angka2, maka tukar angka1 dengan angka2
 if (angka1 < angka2)
 {
 int temp = angka1;
 angka1 = angka2;
 angka2 = temp;
 }

 // 3. Minta siswa untuk menjawab “Berapakah angka1 – angka2?”
 System.out.print
 ("Berapakah " + angka1 + " - " + angka2 + "? ");
 Scanner masukan = new Scanner(System.in);
 int jawab = masukan.nextInt();

 // 4. Periksa jawaban siswa dan tampilkan apakah jawaban benar atau salah
if (angka1 - angka2 == jawab)
 System.out.println("Anda benar!");
 else
 System.out.println("Jawaban Anda salah\n" + angka1 + " - "
 + angka2 + " seharusnya " + (angka1 - angka2));
 }
 }