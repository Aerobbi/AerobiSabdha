public class TampilWaktuSekarang {
public static void main(String[] args) {
// Mendapatkan total milidetik sejak tengah malam 1 Januari 1970
long totalMillidetik = System.currentTimeMillis();

// Mendapatkan total detik sejak tengah malam 1 Januari 1970
long totalDetik = totalMillidetik / 1000;

// Menghitung detik saat ini
long detikSekarang = (int)(totalDetik % 60);

// Mendapatkan total menit
long totalMenit = totalDetik / 60;

// Menghitung menit saat ini
long menitSekarang = totalMenit % 60;

// Mendapatkan total jam
long totalJam = totalMenit / 60;

// Menghitung jam saat ini
long jamSekarang = totalJam % 24;

// Menampilkan hasil
System.out.println("Waktu saat ini adalah " + jamSekarang + ":"
+ menitSekarang + ":" + detikSekarang + " GMT");
}
}