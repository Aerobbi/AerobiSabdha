public class TestJumlah {
 public static void main(String[] args) {
 // Menginisialisasi jumlah
 float jumlah = 0;

 // Tambahkan 0.01, 0.02, ..., 0.99, 1 kepada jumlah
for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
jumlah += i;

 // Tampilkan hasil
 System.out.println("Jumlah adalah " + jumlah);
 }
}