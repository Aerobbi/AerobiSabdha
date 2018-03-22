public class SimulasiMonteCarlo {
 public static void main(String[] args) {
 final int JUMLAH_PERCOBAAN = 10000000;
 int jumlahJatuh = 0;

 for (int i = 0; i < JUMLAH_PERCOBAAN; i++) {
	double x = Math.random() * 2.0 - 1;
	double y = Math.random() * 2.0 - 1;
 if (x * x + y * y <= 1)
jumlahJatuh++;
}
double pi = 4.0 * jumlahJatuh / JUMLAH_PERCOBAAN;
System.out.println("PI adalah " + pi);
 }
 }