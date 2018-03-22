public class PrediksiUangKuliah {
 public static void main(String[] args) {
 double uang_kul = 10000; // Tahun 1
 int tahun = 1;
while (uang_kul < 20000) {
	uang_kul = uang_kul * 1.07;
 tahun++;
 }

 System.out.println("Uang Kuliah akan menjadi dua kali lipat dalam "
 + tahun + " tahun");
 }
 }