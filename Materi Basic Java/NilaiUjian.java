public class NilaiUjian {
 /** Metode Utama */
 public static void main(String[] args) {
 // Jawaban semua siswa terhadap semua pertanyaan
char[][] jawaban = {
	{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
	{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
	{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
	{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

// Kunci jawaban
 char[] kunci = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

 // Nilai semua jawaban
 for (int i = 0; i < jawaban.length; i++) {
 // Nilai jawaban tiap siswa
 int jumlahBenar = 0;
 for (int j = 0; j < jawaban[i].length; j++) {
 if(jawaban[i][j] == kunci[j] )
 jumlahBenar++;
 }

 System.out.println("Jawaban siswa " + i + "memiliki jawaban benar sebanyak " +
 jumlahBenar);
 }
 }
 }