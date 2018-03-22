 public class AngkaPrima {
 public static void main(String[] args) {
 final int JUMLAH_PRIMA = 50; // Jumlah prima yang akan ditampilkan
 final int JUMLAH_PRIMA_PER_BARIS = 10; // Menampilkan 10 per baris
 int hitung = 0; 	// Menghitung jumlah angka prima
 int angka = 2; 	// Angka yang akan diuji keprimaannya

 System.out.println("50 angka prima pertama adalah \n");

 // Secara berulang mencari angka-angka prima
while (hitung < JUMLAH_PRIMA) {
	// Asumsikan angka prima
 boolean apaPrima = true; 

 // Menguji apakah suatu angka prima atau tidak
for (int pembagi = 2; pembagi <= angka / 2; pembagi++) {
	if (angka % pembagi == 0) { // jia true, angka tidak prima
 apaPrima = false; // Tetapkan apaPrima menjadi false
 break; // Keluar loop
 }
}
// Menampilkan angka prima dan menambah hitung
 if (apaPrima) {
 hitung++; // Menginkremen hitung
if (hitung % JUMLAH_PRIMA_PER_BARIS == 0) {
 // Menampilkan angka prima dan ganti baris
 System.out.println(angka);
 }
 else
 System.out.print(angka + " ");
 }

 // Periksa apakah angka berikutnya adalah prima
 angka++;
}
}
}
