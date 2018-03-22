import java.util.Scanner;

 public class LoopKuisPengurangan {
 public static void main(String[] args) {
 final int JUMLAH_PERTANYAAN = 5; // Jumlah pertanyaan
 int hitungBenar = 0; // Menghitung jumlah jawaban yang benar
 int hitung = 0; // Menghitung jumlah pertanyaan
 long waktuMulai = System.currentTimeMillis();
 String keluaran = ""; // String keluaran diinisialisasi kosong
Scanner masukan = new Scanner(System.in);

while (hitung < JUMLAH_PERTANYAAN) {
// 1. Membangkitkan dua integer satu-dijit secara acak
 int angka1 = (int)(Math.random() * 10);
 int angka2 = (int)(Math.random() * 10);

 // 2. Jika angka1 < angka2, tukar angka1 dengan angka2
 if (angka1 < angka2) {
 int temp = angka1;
 angka1 = angka2;
 angka2 = temp;
 }

 // 3. Meminta siswa untuk menjawab "Berapakah angka1 - angka22?"
 System.out.print(
 "Berapakah " + angka1 + " - " + angka2 + "? ");
 int jawab = masukan.nextInt();

 // 4. Grade the answer and display the result
if (angka1 - angka2 == jawab) {
	System.out.println("Anda benar!");
 hitungBenar++;
 }
 else
 System.out.println("Jawaban Anda salah.\n" + angka1
 + " - " + angka2 + " seharusnya " + (angka1 - angka2));
 
 // Inkremen hitung
 hitung++;

 keluaran += "\n" + angka1 + "-" + angka2 + "=" + jawab +
 ((angka1 - angka2 == jawab) ? " benar" : " salah");
}

long waktuAkhir = System.currentTimeMillis();
long waktuUji = waktuAkhir - waktuMulai;

System.out.println("Jumlah yang benar adalah " + hitungBenar +
 "\nWaktu uji adalah " + waktuUji / 1000 + " detik\n" + keluaran);
 }
 }