 public class UjiPelajaran {
 public static void main(String[] args) {
 Pelajaran pelajaran1 = new Pelajaran("Fisika");
 Pelajaran pelajaran2 = new Pelajaran("Biologi");

 pelajaran1.tambahSiswa("Vivian Siahaan");
 pelajaran1.tambahSiswa("Patricia Butet");
 pelajaran1.tambahSiswa("John Sangar");

 pelajaran2.tambahSiswa("Vivian Siahaan");
 pelajaran2.tambahSiswa("Hasiholan Stark");

 System.out.println("Jumlah siswa dalam pelajaran1: "
 + pelajaran1.dapatJumlahSiswa());
 String[] siswa = pelajaran1.dapatSiswa();
 for (int i = 0; i < pelajaran1.dapatJumlahSiswa(); i++)
 System.out.print(siswa[i] + ", ");

 System.out.println();
 System.out.print("Jumlah siswa dalam pelajaran2: "
 + pelajaran2.dapatJumlahSiswa());
 }
 }