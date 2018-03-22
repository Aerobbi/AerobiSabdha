import java.util.Scanner;

public class PajakPenjualan {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);

System.out.print("Masukkan Jumlah Pembelian: ");
double jumlahBeli = masukan.nextDouble();

double pajak = jumlahBeli * 0.06;
System.out.println("Pajak Penjualan adalah " + (int)(pajak * 100) / 100.0) ;
}
}