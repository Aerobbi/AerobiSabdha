public class UjiPelewatanDenganNilai {
 /** Metode utama */
 public static void main(String[] args) {
 // Mendeklarasikan dan menginisialisasi variabel
 int num1 = 1;
 int num2 = 2;

 System.out.println("Sebelum memanggil metode tukar, num1 adalah " +
 num1 + " dan num2 adalah " + num2);

 // Memanggil metode tukar untuk menukar dua variabel
tukar(num1, num2);

System.out.println("Setelah memanggil metode tukar, num1 adalah " +
 num1 + " dan num2 adalah " + num2);
 }

 /** Menukar dua variabel */
public static void tukar(int n1, int n2) {
 System.out.println("\tDi dalam metode tukar");
 System.out.println("\t\tSebelum penukaran n1 adalah " + n1
 + " n2 adalah " + n2);

 // Menukar n1 dengan n2
 int temp = n1;
 n1 = n2;
 n2 = temp;

 System.out.println("\t\tSetelah penukaran n1 adalah " + n1
 + " n2 adalah " + n2);
 }
 }